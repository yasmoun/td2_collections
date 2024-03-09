import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
public class Stock {
	private HashSet <Article> articlesMg = new HashSet<Article>() ;
	private HashMap<String, Integer> stockMg = new HashMap<String,Integer>();
	public boolean addNouvArticle(Article a, int qt )
	{
	if(stockMg.containsKey(a.getNom()))
		return false;
	articlesMg.add(a) ;
	stockMg.put(a.getNom(), qt);
	return true;
	}
	public Stock() {};
	public boolean verifArticle(String a )
	{ 
		return stockMg.containsKey(a);
	}
	
	public Article getArticle(String a ) {
		for(Article ar : articlesMg) {
			if(ar.getNom().equals(a))
				return ar;
	}
		return null;
	}
	public boolean removeArticle(String a )
	{
	if(!stockMg.containsKey(a))
		return false;
	Iterator<Article> it= articlesMg.iterator();
	while(it.hasNext())
	{if(it.next().getNom().equals(a))
	{
	it.remove();	
	stockMg.remove(a);
	return true;
	}
	}
	return false;
}
	public int getQt(String a)
	{
	if(!stockMg.containsKey(a))
	return -1;
	else
	return stockMg.get(a);

	}
	public Boolean changeQt(String a, int i)
	{
	if(!stockMg.containsKey(a))
	return false;
	int qt =stockMg.get(a);
	qt = qt +i;
	if(qt<0)
	return false;
	else
	stockMg.put(a, qt);
	return true ; }

	public void sortStock( )
	{
		TreeMap <String,Integer> SrStock =new TreeMap<String,Integer>(stockMg);
		for(String ar :SrStock.keySet()) {
			System.out.println("article: "+ar+", quantité: "+ SrStock.get(ar));
	}
	}
}
