import java.util.Date;

/**
 * 
 */

/**
 * @author Pras
 * used composite pattern to design the entry class as both file and directory have 
 * common operations in nature
 */
public abstract class Entry {
	
	protected String fileName; 
	protected long created;
	protected long  updated;
	protected long lastAccessed;
	protected Directory parent;
	
	
	public Entry(String n, Directory p) {
        fileName = n;
        parent = p;
        created = System.currentTimeMillis();
    }
    public boolean delete() {
        if (parent == null) {
            return false;
        }
        return parent.deleteEntry(this);
    }
    public abstract int size();

    public String getFullPath() {
        if (parent == null) {
            return fileName;
        } else {
            return parent.getFullPath() + "/" + fileName;
        }
    }
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public long getUpdated() {
		return updated;
	}
	public void setUpdated(long updated) {
		this.updated = updated;
	}
	public long getLastAccessed() {
		return lastAccessed;
	}
	public void setLastAccessed(long lastAccessed) {
		this.lastAccessed = lastAccessed;
	}
    
    

}
