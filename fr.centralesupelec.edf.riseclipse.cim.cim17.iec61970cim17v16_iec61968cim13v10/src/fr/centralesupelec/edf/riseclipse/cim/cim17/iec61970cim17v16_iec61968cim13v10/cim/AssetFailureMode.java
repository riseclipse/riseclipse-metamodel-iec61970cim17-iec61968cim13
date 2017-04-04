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
 * A representation of the literals of the enumeration '<em><b>Asset Failure Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetFailureMode()
 * @model
 * @generated
 */
public enum AssetFailureMode implements Enumerator {
    /**
     * The '<em><b>Fail To Carry Load</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAIL_TO_CARRY_LOAD_VALUE
     * @generated
     * @ordered
     */
    FAIL_TO_CARRY_LOAD( 0, "failToCarryLoad", "failToCarryLoad" ),

    /**
     * The '<em><b>Fail To Close</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAIL_TO_CLOSE_VALUE
     * @generated
     * @ordered
     */
    FAIL_TO_CLOSE( 1, "failToClose", "failToClose" ),

    /**
     * The '<em><b>Fail To Interrupt</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAIL_TO_INTERRUPT_VALUE
     * @generated
     * @ordered
     */
    FAIL_TO_INTERRUPT( 2, "failToInterrupt", "failToInterrupt" ),

    /**
     * The '<em><b>Fail To Open</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAIL_TO_OPEN_VALUE
     * @generated
     * @ordered
     */
    FAIL_TO_OPEN( 3, "failToOpen", "failToOpen" ),

    /**
     * The '<em><b>Fail To Provide Insulation Level</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAIL_TO_PROVIDE_INSULATION_LEVEL_VALUE
     * @generated
     * @ordered
     */
    FAIL_TO_PROVIDE_INSULATION_LEVEL( 4, "failToProvideInsulationLevel", "failToProvideInsulationLevel" );

    /**
     * The '<em><b>Fail To Carry Load</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fail To Carry Load</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAIL_TO_CARRY_LOAD
     * @model name="failToCarryLoad"
     * @generated
     * @ordered
     */
    public static final int FAIL_TO_CARRY_LOAD_VALUE = 0;

    /**
     * The '<em><b>Fail To Close</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fail To Close</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAIL_TO_CLOSE
     * @model name="failToClose"
     * @generated
     * @ordered
     */
    public static final int FAIL_TO_CLOSE_VALUE = 1;

    /**
     * The '<em><b>Fail To Interrupt</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fail To Interrupt</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAIL_TO_INTERRUPT
     * @model name="failToInterrupt"
     * @generated
     * @ordered
     */
    public static final int FAIL_TO_INTERRUPT_VALUE = 2;

    /**
     * The '<em><b>Fail To Open</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fail To Open</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAIL_TO_OPEN
     * @model name="failToOpen"
     * @generated
     * @ordered
     */
    public static final int FAIL_TO_OPEN_VALUE = 3;

    /**
     * The '<em><b>Fail To Provide Insulation Level</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fail To Provide Insulation Level</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAIL_TO_PROVIDE_INSULATION_LEVEL
     * @model name="failToProvideInsulationLevel"
     * @generated
     * @ordered
     */
    public static final int FAIL_TO_PROVIDE_INSULATION_LEVEL_VALUE = 4;

    /**
     * An array of all the '<em><b>Asset Failure Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssetFailureMode[] VALUES_ARRAY = new AssetFailureMode[] { FAIL_TO_CARRY_LOAD, FAIL_TO_CLOSE,
            FAIL_TO_INTERRUPT, FAIL_TO_OPEN, FAIL_TO_PROVIDE_INSULATION_LEVEL, };

    /**
     * A public read-only list of all the '<em><b>Asset Failure Mode</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AssetFailureMode > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Asset Failure Mode</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetFailureMode get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetFailureMode result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Failure Mode</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetFailureMode getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetFailureMode result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Failure Mode</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetFailureMode get( int value ) {
        switch( value ) {
        case FAIL_TO_CARRY_LOAD_VALUE:
            return FAIL_TO_CARRY_LOAD;
        case FAIL_TO_CLOSE_VALUE:
            return FAIL_TO_CLOSE;
        case FAIL_TO_INTERRUPT_VALUE:
            return FAIL_TO_INTERRUPT;
        case FAIL_TO_OPEN_VALUE:
            return FAIL_TO_OPEN;
        case FAIL_TO_PROVIDE_INSULATION_LEVEL_VALUE:
            return FAIL_TO_PROVIDE_INSULATION_LEVEL;
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
    private AssetFailureMode( int value, String name, String literal ) {
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

} //AssetFailureMode
