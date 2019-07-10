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
 * A representation of the literals of the enumeration '<em><b>Exc ST7BOE Lselector Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getExcST7BOELselectorKind()
 * @model
 * @generated
 */
public enum ExcST7BOELselectorKind implements Enumerator {
    /**
     * The '<em><b>No OE Linput</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_OE_LINPUT_VALUE
     * @generated
     * @ordered
     */
    NO_OE_LINPUT( 0, "noOELinput", "noOELinput" ),

    /**
     * The '<em><b>Add Vref</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ADD_VREF_VALUE
     * @generated
     * @ordered
     */
    ADD_VREF( 1, "addVref", "addVref" ),

    /**
     * The '<em><b>Input LVgate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INPUT_LVGATE_VALUE
     * @generated
     * @ordered
     */
    INPUT_LVGATE( 2, "inputLVgate", "inputLVgate" ),

    /**
     * The '<em><b>Output LVgate</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OUTPUT_LVGATE_VALUE
     * @generated
     * @ordered
     */
    OUTPUT_LVGATE( 3, "outputLVgate", "outputLVgate" );

    /**
     * The '<em><b>No OE Linput</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No OE Linput</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO_OE_LINPUT
     * @model name="noOELinput"
     * @generated
     * @ordered
     */
    public static final int NO_OE_LINPUT_VALUE = 0;

    /**
     * The '<em><b>Add Vref</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Add Vref</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADD_VREF
     * @model name="addVref"
     * @generated
     * @ordered
     */
    public static final int ADD_VREF_VALUE = 1;

    /**
     * The '<em><b>Input LVgate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Input LVgate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INPUT_LVGATE
     * @model name="inputLVgate"
     * @generated
     * @ordered
     */
    public static final int INPUT_LVGATE_VALUE = 2;

    /**
     * The '<em><b>Output LVgate</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Output LVgate</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OUTPUT_LVGATE
     * @model name="outputLVgate"
     * @generated
     * @ordered
     */
    public static final int OUTPUT_LVGATE_VALUE = 3;

    /**
     * An array of all the '<em><b>Exc ST7BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ExcST7BOELselectorKind[] VALUES_ARRAY = new ExcST7BOELselectorKind[] { NO_OE_LINPUT, ADD_VREF,
            INPUT_LVGATE, OUTPUT_LVGATE, };

    /**
     * A public read-only list of all the '<em><b>Exc ST7BOE Lselector Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ExcST7BOELselectorKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ExcST7BOELselectorKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ExcST7BOELselectorKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Exc ST7BOE Lselector Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ExcST7BOELselectorKind get( int value ) {
        switch( value ) {
        case NO_OE_LINPUT_VALUE:
            return NO_OE_LINPUT;
        case ADD_VREF_VALUE:
            return ADD_VREF;
        case INPUT_LVGATE_VALUE:
            return INPUT_LVGATE;
        case OUTPUT_LVGATE_VALUE:
            return OUTPUT_LVGATE;
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
    private ExcST7BOELselectorKind( int value, String name, String literal ) {
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

} //ExcST7BOELselectorKind
