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
 * A representation of the literals of the enumeration '<em><b>Switch Action Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchActionKind()
 * @model
 * @generated
 */
public enum SwitchActionKind implements Enumerator {
    /**
     * The '<em><b>Open</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPEN_VALUE
     * @generated
     * @ordered
     */
    OPEN( 0, "open", "open" ),

    /**
     * The '<em><b>Close</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLOSE_VALUE
     * @generated
     * @ordered
     */
    CLOSE( 1, "close", "close" ),

    /**
     * The '<em><b>Disable Reclosing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISABLE_RECLOSING_VALUE
     * @generated
     * @ordered
     */
    DISABLE_RECLOSING( 2, "disableReclosing", "disableReclosing" ),

    /**
     * The '<em><b>Enable Reclosing</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENABLE_RECLOSING_VALUE
     * @generated
     * @ordered
     */
    ENABLE_RECLOSING( 3, "enableReclosing", "enableReclosing" );

    /**
     * The '<em><b>Open</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Open</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPEN
     * @model name="open"
     * @generated
     * @ordered
     */
    public static final int OPEN_VALUE = 0;

    /**
     * The '<em><b>Close</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Close</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLOSE
     * @model name="close"
     * @generated
     * @ordered
     */
    public static final int CLOSE_VALUE = 1;

    /**
     * The '<em><b>Disable Reclosing</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Disable Reclosing</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISABLE_RECLOSING
     * @model name="disableReclosing"
     * @generated
     * @ordered
     */
    public static final int DISABLE_RECLOSING_VALUE = 2;

    /**
     * The '<em><b>Enable Reclosing</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Enable Reclosing</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENABLE_RECLOSING
     * @model name="enableReclosing"
     * @generated
     * @ordered
     */
    public static final int ENABLE_RECLOSING_VALUE = 3;

    /**
     * An array of all the '<em><b>Switch Action Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SwitchActionKind[] VALUES_ARRAY = new SwitchActionKind[] { OPEN, CLOSE, DISABLE_RECLOSING,
            ENABLE_RECLOSING, };

    /**
     * A public read-only list of all the '<em><b>Switch Action Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< SwitchActionKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Switch Action Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SwitchActionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            SwitchActionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Switch Action Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SwitchActionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            SwitchActionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Switch Action Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SwitchActionKind get( int value ) {
        switch( value ) {
        case OPEN_VALUE:
            return OPEN;
        case CLOSE_VALUE:
            return CLOSE;
        case DISABLE_RECLOSING_VALUE:
            return DISABLE_RECLOSING;
        case ENABLE_RECLOSING_VALUE:
            return ENABLE_RECLOSING;
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
    private SwitchActionKind( int value, String name, String literal ) {
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

} //SwitchActionKind
