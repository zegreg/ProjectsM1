
public class HelpCmd extends ICommand{

	public HelpCmd(String name) {
		super("help");

	}



	@Override
	public void execute(String[] strings) {
		System.out.println(new PrintCmd().getName() +"(message)\n"
				+new MinusCmd().getName()+ "(value 1) (value 2)\n"
				+new SumCmd().getName()+"(value 1) (value 2)\n"
				+new ExitCmd().getName()+ "\n");

	}

}
