
public class Edge {
	public final Vertex source, target;
	//public boolean diamond;
	
	public Edge (Vertex source, Vertex target) {
		this.source = source;
		this.target = target;
	}
	
	public Edge (int source, int target) {
		this.source = new Vertex(source);
		this.target = new Vertex(target);
	}

	@Override
	public boolean equals(Object o) {
		Edge obj = (Edge) o;
		if (source.get_vertex() == obj.source.get_vertex() && target.get_vertex() == obj.target.get_vertex())
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int) (Math.pow(13, source.get_vertex())*Math.pow(17, target.get_vertex()));
	}
}
