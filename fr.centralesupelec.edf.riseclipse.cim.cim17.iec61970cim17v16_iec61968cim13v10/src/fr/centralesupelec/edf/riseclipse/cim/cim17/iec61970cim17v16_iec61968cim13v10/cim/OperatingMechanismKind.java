/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operating Mechanism Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperatingMechanismKind()
 * @model
 * @generated
 */
public enum OperatingMechanismKind implements Enumerator {
    /**
     * The '<em><b>Capacitor Trip</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CAPACITOR_TRIP_VALUE
     * @generated
     * @ordered
     */
    CAPACITOR_TRIP( 0, "capacitorTrip", "capacitorTrip" ),

    /**
     * The '<em><b>Hydraulic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HYDRAULIC_VALUE
     * @generated
     * @ordered
     */
    HYDRAULIC( 1, "hydraulic", "hydraulic" ),

    /**
     * The '<em><b>Pneudraulic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PNEUDRAULIC_VALUE
     * @generated
     * @ordered
     */
    PNEUDRAULIC( 2, "pneudraulic", "pneudraulic" ),

    /**
     * The '<em><b>Pneumatic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PNEUMATIC_VALUE
     * @generated
     * @ordered
     */
    PNEUMATIC( 3, "pneumatic", "pneumatic" ),

    /**
     * The '<em><b>Solenoid</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLENOID_VALUE
     * @generated
     * @ordered
     */
    SOLENOID( 4, "solenoid", "solenoid" ),

    /**
     * The '<em><b>Spring</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPRING_VALUE
     * @generated
     * @ordered
     */
    SPRING( 5, "spring", "spring" ),

    /**
     * The '<em><b>Spring Hand Crank</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPRING_HAND_CRANK_VALUE
     * @generated
     * @ordered
     */
    SPRING_HAND_CRANK( 6, "springHandCrank", "springHandCrank" ),

    /**
     * The '<em><b>Spring Hydraulic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPRING_HYDRAULIC_VALUE
     * @generated
     * @ordered
     */
    SPRING_HYDRAULIC( 7, "springHydraulic", "springHydraulic" ),

    /**
     * The '<em><b>Spring Motor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPRING_MOTOR_VALUE
     * @generated
     * @ordered
     */
    SPRING_MOTOR( 8, "springMotor", "springMotor" );

    /**
     * The '<em><b>Capacitor Trip</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Capacitor Trip</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CAPACITOR_TRIP
     * @model name="capacitorTrip"
     * @generated
     * @ordered
     */
    public static final int CAPACITOR_TRIP_VALUE = 0;

    /**
     * The '<em><b>Hydraulic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Hydraulic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HYDRAULIC
     * @model name="hydraulic"
     * @generated
     * @ordered
     */
    public static final int HYDRAULIC_VALUE = 1;

    /**
     * The '<em><b>Pneudraulic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pneudraulic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PNEUDRAULIC
     * @model name="pneudraulic"
     * @generated
     * @ordered
     */
    public static final int PNEUDRAULIC_VALUE = 2;

    /**
     * The '<em><b>Pneumatic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pneumatic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PNEUMATIC
     * @model name="pneumatic"
     * @generated
     * @ordered
     */
    public static final int PNEUMATIC_VALUE = 3;

    /**
     * The '<em><b>Solenoid</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Solenoid</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLENOID
     * @model name="solenoid"
     * @generated
     * @ordered
     */
    public static final int SOLENOID_VALUE = 4;

    /**
     * The '<em><b>Spring</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spring</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPRING
     * @model name="spring"
     * @generated
     * @ordered
     */
    public static final int SPRING_VALUE = 5;

    /**
     * The '<em><b>Spring Hand Crank</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spring Hand Crank</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPRING_HAND_CRANK
     * @model name="springHandCrank"
     * @generated
     * @ordered
     */
    public static final int SPRING_HAND_CRANK_VALUE = 6;

    /**
     * The '<em><b>Spring Hydraulic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spring Hydraulic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPRING_HYDRAULIC
     * @model name="springHydraulic"
     * @generated
     * @ordered
     */
    public static final int SPRING_HYDRAULIC_VALUE = 7;

    /**
     * The '<em><b>Spring Motor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spring Motor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPRING_MOTOR
     * @model name="springMotor"
     * @generated
     * @ordered
     */
    public static final int SPRING_MOTOR_VALUE = 8;

    /**
     * An array of all the '<em><b>Operating Mechanism Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OperatingMechanismKind[] VALUES_ARRAY = new OperatingMechanismKind[] { CAPACITOR_TRIP,
            HYDRAULIC, PNEUDRAULIC, PNEUMATIC, SOLENOID, SPRING, SPRING_HAND_CRANK, SPRING_HYDRAULIC, SPRING_MOTOR, };

    /**
     * A public read-only list of all the '<em><b>Operating Mechanism Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OperatingMechanismKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Operating Mechanism Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperatingMechanismKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OperatingMechanismKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operating Mechanism Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperatingMechanismKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OperatingMechanismKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Operating Mechanism Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OperatingMechanismKind get( int value ) {
        switch( value ) {
        case CAPACITOR_TRIP_VALUE:
            return CAPACITOR_TRIP;
        case HYDRAULIC_VALUE:
            return HYDRAULIC;
        case PNEUDRAULIC_VALUE:
            return PNEUDRAULIC;
        case PNEUMATIC_VALUE:
            return PNEUMATIC;
        case SOLENOID_VALUE:
            return SOLENOID;
        case SPRING_VALUE:
            return SPRING;
        case SPRING_HAND_CRANK_VALUE:
            return SPRING_HAND_CRANK;
        case SPRING_HYDRAULIC_VALUE:
            return SPRING_HYDRAULIC;
        case SPRING_MOTOR_VALUE:
            return SPRING_MOTOR;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private OperatingMechanismKind( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //OperatingMechanismKind
