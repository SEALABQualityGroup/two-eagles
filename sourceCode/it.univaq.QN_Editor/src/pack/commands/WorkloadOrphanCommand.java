package pack.commands;

import org.eclipse.gef.commands.Command;

import pack.errorManagement.Finestra;
import pack.model.IWorkload;
import pack.model.structure.WorkloadModel;

public class WorkloadOrphanCommand extends Command 
	{
	
	/** IWorkload to remove. */
	private final IWorkload child;

	/** WorkloadModel to remove from. */
	private final WorkloadModel parent;

	/**
	 * Create a command that will remove the workload from its parent.
	 * @param parent the WorkloadModel containing the child
	 * @param child    the IWorkload to remove
	 */
	public WorkloadOrphanCommand(WorkloadModel parent, IWorkload child)
		throws Exception
		{
		if (parent == null || child == null) 
			{
			Finestra.mostraIE("parent is null");
			}
		if (child == null)
			{
			Finestra.mostraIE("child is null");
			}
		setLabel("workload deletion");
		this.parent = parent;
		this.child = child;
		}

	@Override
	public void execute() 
		{
		redo();
		}

	@Override
	public void redo() 
		{
		// remove the child
		parent.removeChild(child);
		}

	@Override
	public void undo() 
		{
		// add the child
		parent.addChild(child);
		}	
	
	}
