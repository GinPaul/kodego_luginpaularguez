package com.oop3

class Dog: Animal,Pet,Mammal() {
    //interfaces (Animal and Pet) doesn't require "()". But inherited class Mammal needs "()"

    override fun walk(){
        println("Dog walks")

    }

    override fun makeSound(){
        println("Aw aw")

    }

    override fun groom(){
        println("Dog can be groomed")

    }

    override fun feed() {
        println("Dog feeds")

    }
}