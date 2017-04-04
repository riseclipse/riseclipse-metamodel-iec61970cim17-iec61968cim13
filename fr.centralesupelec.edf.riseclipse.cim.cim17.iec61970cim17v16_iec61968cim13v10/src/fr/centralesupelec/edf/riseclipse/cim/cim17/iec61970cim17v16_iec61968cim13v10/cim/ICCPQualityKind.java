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
 * A representation of the literals of the enumeration '<em><b>ICCP Quality Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPQualityKind()
 * @model
 * @generated
 */
public enum ICCPQualityKind implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 0, "none", "none" ),

    /**
     * The '<em><b>Quality Only</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUALITY_ONLY_VALUE
     * @generated
     * @ordered
     */
    QUALITY_ONLY( 1, "qualityOnly", "qualityOnly" ),

    /**
     * The '<em><b>Quality And Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUALITY_AND_TIME_VALUE
     * @generated
     * @ordered
     */
    QUALITY_AND_TIME( 2, "qualityAndTime", "qualityAndTime" ),

    /**
     * The '<em><b>Extended</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTENDED_VALUE
     * @generated
     * @ordered
     */
    EXTENDED( 3, "extended", "extended" ),

    /**
     * The '<em><b>Extendedwith Quality Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTENDEDWITH_QUALITY_TIME_VALUE
     * @generated
     * @ordered
     */
    EXTENDEDWITH_QUALITY_TIME( 4, "extendedwithQualityTime", "extendedwithQualityTime" );

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>Quality Only</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quality Only</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUALITY_ONLY
     * @model name="qualityOnly"
     * @generated
     * @ordered
     */
    public static final int QUALITY_ONLY_VALUE = 1;

    /**
     * The '<em><b>Quality And Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quality And Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUALITY_AND_TIME
     * @model name="qualityAndTime"
     * @generated
     * @ordered
     */
    public static final int QUALITY_AND_TIME_VALUE = 2;

    /**
     * The '<em><b>Extended</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Extended</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTENDED
     * @model name="extended"
     * @generated
     * @ordered
     */
    public static final int EXTENDED_VALUE = 3;

    /**
     * The '<em><b>Extendedwith Quality Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Extendedwith Quality Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTENDEDWITH_QUALITY_TIME
     * @model name="extendedwithQualityTime"
     * @generated
     * @ordered
     */
    public static final int EXTENDEDWITH_QUALITY_TIME_VALUE = 4;

    /**
     * An array of all the '<em><b>ICCP Quality Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ICCPQualityKind[] VALUES_ARRAY = new ICCPQualityKind[] { NONE, QUALITY_ONLY, QUALITY_AND_TIME,
            EXTENDED, EXTENDEDWITH_QUALITY_TIME, };

    /**
     * A public read-only list of all the '<em><b>ICCP Quality Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ICCPQualityKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>ICCP Quality Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPQualityKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ICCPQualityKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ICCP Quality Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPQualityKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ICCPQualityKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ICCP Quality Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ICCPQualityKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case QUALITY_ONLY_VALUE:
            return QUALITY_ONLY;
        case QUALITY_AND_TIME_VALUE:
            return QUALITY_AND_TIME;
        case EXTENDED_VALUE:
            return EXTENDED;
        case EXTENDEDWITH_QUALITY_TIME_VALUE:
            return EXTENDEDWITH_QUALITY_TIME;
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
    private ICCPQualityKind( int value, String name, String literal ) {
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

} //ICCPQualityKind
