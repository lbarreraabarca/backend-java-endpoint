package com.data.factory.models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FirebasePathsTest {

    @Test
    void setAndToStringTest(){
        String collection = "collection";
        String document = "document";
        String field = "field";
        String expected = "FirebasePaths(collection=collection, document=document, field=field)";
        FirebasePaths actual = new FirebasePaths();
        actual.setCollection(collection);
        actual.setDocument(document);
        actual.setField(field);
        Assert.assertEquals(collection, actual.getCollection());
        Assert.assertEquals(document, actual.getDocument());
        Assert.assertEquals(field, actual.getField());
        Assert.assertEquals(expected, actual.toString());
    }
}
