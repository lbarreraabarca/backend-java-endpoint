package com.data.factory.models;

public class FirebasePaths  {

    private String collection;
    private String document;
    private String field;
    public FirebasePaths(){}
    /**
     * @return the collection
     */
    public String getCollection() {
        return collection;
    }
    /**
     * @param collection the collection to set
     */
    public void setCollection(String collection) {
        this.collection = collection;
    }
    /**
     * @return the document
     */
    public String getDocument() {
        return document;
    }
    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }
    /**
     * @return the field
     */
    public String getField() {
        return field;
    }
    /**
     * @param field the field to set
     */
    public void setField(String field) {
        this.field = field;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "FirebasePaths(collection=" + collection + ", document=" + document + ", field=" + field + ")";
    }
}
