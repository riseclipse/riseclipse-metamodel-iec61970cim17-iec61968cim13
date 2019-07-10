/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Synchronous Machine Model Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineModelKind()
 * @model
 * @generated
 */
public enum SynchronousMachineModelKind implements Enumerator {
    /**
     * The '<em><b>Subtransient</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_VALUE
     * @generated
     * @ordered
     */
    SUBTRANSIENT( 0, "subtransient", "subtransient" ),

    /**
     * The '<em><b>Subtransient Type F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_TYPE_F_VALUE
     * @generated
     * @ordered
     */
    SUBTRANSIENT_TYPE_F( 1, "subtransientTypeF", "subtransientTypeF" ),

    /**
     * The '<em><b>Subtransient Type J</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_TYPE_J_VALUE
     * @generated
     * @ordered
     */
    SUBTRANSIENT_TYPE_J( 2, "subtransientTypeJ", "subtransientTypeJ" ),

    /**
     * The '<em><b>Subtransient Simplified</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_SIMPLIFIED_VALUE
     * @generated
     * @ordered
     */
    SUBTRANSIENT_SIMPLIFIED( 3, "subtransientSimplified", "subtransientSimplified" ),

    /**
     * The '<em><b>Subtransient Simplified Direct Axis</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS_VALUE
     * @generated
     * @ordered
     */
    SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS( 4, "subtransientSimplifiedDirectAxis", "subtransientSimplifiedDirectAxis" );

    /**
     * The '<em><b>Subtransient</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subtransient</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT
     * @model name="subtransient"
     * @generated
     * @ordered
     */
    public static final int SUBTRANSIENT_VALUE = 0;

    /**
     * The '<em><b>Subtransient Type F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subtransient Type F</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_TYPE_F
     * @model name="subtransientTypeF"
     * @generated
     * @ordered
     */
    public static final int SUBTRANSIENT_TYPE_F_VALUE = 1;

    /**
     * The '<em><b>Subtransient Type J</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subtransient Type J</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_TYPE_J
     * @model name="subtransientTypeJ"
     * @generated
     * @ordered
     */
    public static final int SUBTRANSIENT_TYPE_J_VALUE = 2;

    /**
     * The '<em><b>Subtransient Simplified</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subtransient Simplified</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_SIMPLIFIED
     * @model name="subtransientSimplified"
     * @generated
     * @ordered
     */
    public static final int SUBTRANSIENT_SIMPLIFIED_VALUE = 3;

    /**
     * The '<em><b>Subtransient Simplified Direct Axis</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Subtransient Simplified Direct Axis</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS
     * @model name="subtransientSimplifiedDirectAxis"
     * @generated
     * @ordered
     */
    public static final int SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS_VALUE = 4;

    /**
     * An array of all the '<em><b>Synchronous Machine Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SynchronousMachineModelKind[] VALUES_ARRAY = new SynchronousMachineModelKind[] { SUBTRANSIENT,
            SUBTRANSIENT_TYPE_F, SUBTRANSIENT_TYPE_J, SUBTRANSIENT_SIMPLIFIED, SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS, };

    /**
     * A public read-only list of all the '<em><b>Synchronous Machine Model Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< SynchronousMachineModelKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Synchronous Machine Model Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineModelKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            SynchronousMachineModelKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Model Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineModelKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            SynchronousMachineModelKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Synchronous Machine Model Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SynchronousMachineModelKind get( int value ) {
        switch( value ) {
        case SUBTRANSIENT_VALUE:
            return SUBTRANSIENT;
        case SUBTRANSIENT_TYPE_F_VALUE:
            return SUBTRANSIENT_TYPE_F;
        case SUBTRANSIENT_TYPE_J_VALUE:
            return SUBTRANSIENT_TYPE_J;
        case SUBTRANSIENT_SIMPLIFIED_VALUE:
            return SUBTRANSIENT_SIMPLIFIED;
        case SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS_VALUE:
            return SUBTRANSIENT_SIMPLIFIED_DIRECT_AXIS;
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
    private SynchronousMachineModelKind( int value, String name, String literal ) {
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

} //SynchronousMachineModelKind
