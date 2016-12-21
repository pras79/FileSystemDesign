
public class File extends Entry {
	
	private String content;
    private int size;

    public File(String n, Directory p, int sz) {
        super(n, p);
        setSize(sz);
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void writeToFile ( String name , String content ) {
		
		
	}
	public String readFromFile ( String fileName){
		return ""; 
		
	}
	
    public void close() {}



}
