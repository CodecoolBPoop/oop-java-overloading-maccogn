package com.codecool.uml.overloading;

public class FeaturedProductCategory extends ProductCategory{
    private Date startDate;
    private Date endDate;

    public void schedule(Date startDate, Date endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return "Start date:"+this.startDate+" End date:" +this.endDate;
    }

}
