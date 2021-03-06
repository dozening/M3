package eco.data.m3.routing.exception;

/**
 * 
 * An exception used to indicate that a content already exist on the DHT
 * 
 * @author xquan
 *
 */
public class ContentExistException extends Exception{

    public ContentExistException(String message)
    {
        super(message);
    }
    
}
