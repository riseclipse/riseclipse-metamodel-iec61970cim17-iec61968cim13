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
 * A representation of the literals of the enumeration '<em><b>Phase Connected Fault Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPhaseConnectedFaultKind()
 * @model
 * @generated
 */
public enum PhaseConnectedFaultKind implements Enumerator {
    /**
     * The '<em><b>Line To Ground</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINE_TO_GROUND_VALUE
     * @generated
     * @ordered
     */
    LINE_TO_GROUND( 0, "lineToGround", "lineToGround" ),

    /**
     * The '<em><b>Line To Line</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINE_TO_LINE_VALUE
     * @generated
     * @ordered
     */
    LINE_TO_LINE( 1, "lineToLine", "lineToLine" ),

    /**
     * The '<em><b>Line To Line To Ground</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LINE_TO_LINE_TO_GROUND_VALUE
     * @generated
     * @ordered
     */
    LINE_TO_LINE_TO_GROUND( 2, "lineToLineToGround", "lineToLineToGround" );

    /**
     * The '<em><b>Line To Ground</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Line To Ground</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINE_TO_GROUND
     * @model name="lineToGround"
     * @generated
     * @ordered
     */
    public static final int LINE_TO_GROUND_VALUE = 0;

    /**
     * The '<em><b>Line To Line</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Line To Line</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINE_TO_LINE
     * @model name="lineToLine"
     * @generated
     * @ordered
     */
    public static final int LINE_TO_LINE_VALUE = 1;

    /**
     * The '<em><b>Line To Line To Ground</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Line To Line To Ground</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LINE_TO_LINE_TO_GROUND
     * @model name="lineToLineToGround"
     * @generated
     * @ordered
     */
    public static final int LINE_TO_LINE_TO_GROUND_VALUE = 2;

    /**
     * An array of all the '<em><b>Phase Connected Fault Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final PhaseConnectedFaultKind[] VALUES_ARRAY = new PhaseConnectedFaultKind[] { LINE_TO_GROUND,
            LINE_TO_LINE, LINE_TO_LINE_TO_GROUND, };

    /**
     * A public read-only list of all the '<em><b>Phase Connected Fault Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< PhaseConnectedFaultKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Phase Connected Fault Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseConnectedFaultKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            PhaseConnectedFaultKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Phase Connected Fault Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseConnectedFaultKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            PhaseConnectedFaultKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Phase Connected Fault Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static PhaseConnectedFaultKind get( int value ) {
        switch( value ) {
        case LINE_TO_GROUND_VALUE:
            return LINE_TO_GROUND;
        case LINE_TO_LINE_VALUE:
            return LINE_TO_LINE;
        case LINE_TO_LINE_TO_GROUND_VALUE:
            return LINE_TO_LINE_TO_GROUND;
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
    private PhaseConnectedFaultKind( int value, String name, String literal ) {
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

} //PhaseConnectedFaultKind
