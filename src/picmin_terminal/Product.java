package picmin_terminal;

public class Product {
    private int id;
    private String name;
    private String origin;
    private int harvestDate;
    private int stock;
    private float price;

	public Product(int id, String name, String origin, int harvestDate, int stock, float price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.harvestDate = harvestDate;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getHarvestDate() {
		return harvestDate;
	}

	public void setHarvestDate(int harvestDate) {
		this.harvestDate = harvestDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name=" + name + ", Origin=" + origin + ", [HarvestDate=" + harvestDate + ", [Stock=" + stock + ", Price=" + price + "]";
    }
}
