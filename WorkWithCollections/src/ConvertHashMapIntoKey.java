import java.util.Iterator;
import java.util.LinkedHashMap;



public class ConvertHashMapIntoKey {

	  public static final String mapToString( LinkedHashMap<?, ?> map )
	  {
	      if ( ( map == null ) || ( map.size() == 0 ) )
	      {
	          return "";
	      }

	      StringBuffer sb = new StringBuffer();
	      boolean isFirst = true;

	      Iterator<?> iter = map.keySet().iterator();
	      

	      while ( iter.hasNext() )
	      {
	          if ( isFirst )
	          {
	              isFirst = false;
	          }
	          else
	          {
	              sb.append( ", " );
	          }

	          Object key = iter.next();
	          sb.append( key );
	          //sb.append( " : '" ).append( map.get( key ) ).append( "'" );
	          sb.append( " : " ).append( map.get( key ) );
	      }

	      return sb.toString();
	  }

}
