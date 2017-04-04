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
 * A representation of the literals of the enumeration '<em><b>Procedure Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProcedureKind()
 * @model
 * @generated
 */
public enum ProcedureKind implements Enumerator {
    /**
     * The '<em><b>Inspection</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSPECTION_VALUE
     * @generated
     * @ordered
     */
    INSPECTION( 0, "inspection", "inspection" ),

    /**
     * The '<em><b>Diagnosis</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIAGNOSIS_VALUE
     * @generated
     * @ordered
     */
    DIAGNOSIS( 1, "diagnosis", "diagnosis" ),

    /**
     * The '<em><b>Maintenance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAINTENANCE_VALUE
     * @generated
     * @ordered
     */
    MAINTENANCE( 2, "maintenance", "maintenance" ),

    /**
     * The '<em><b>Test</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TEST_VALUE
     * @generated
     * @ordered
     */
    TEST( 3, "test", "test" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 4, "other", "other" );

    /**
     * The '<em><b>Inspection</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inspection</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INSPECTION
     * @model name="inspection"
     * @generated
     * @ordered
     */
    public static final int INSPECTION_VALUE = 0;

    /**
     * The '<em><b>Diagnosis</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Diagnosis</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DIAGNOSIS
     * @model name="diagnosis"
     * @generated
     * @ordered
     */
    public static final int DIAGNOSIS_VALUE = 1;

    /**
     * The '<em><b>Maintenance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maintenance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAINTENANCE
     * @model name="maintenance"
     * @generated
     * @ordered
     */
    public static final int MAINTENANCE_VALUE = 2;

    /**
     * The '<em><b>Test</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Test</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TEST
     * @model name="test"
     * @generated
     * @ordered
     */
    public static final int TEST_VALUE = 3;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 4;

    /**
     * An array of all the '<em><b>Procedure Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ProcedureKind[] VALUES_ARRAY = new ProcedureKind[] { INSPECTION, DIAGNOSIS, MAINTENANCE, TEST,
            OTHER, };

    /**
     * A public read-only list of all the '<em><b>Procedure Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< ProcedureKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Procedure Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProcedureKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ProcedureKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Procedure Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProcedureKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            ProcedureKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Procedure Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ProcedureKind get( int value ) {
        switch( value ) {
        case INSPECTION_VALUE:
            return INSPECTION;
        case DIAGNOSIS_VALUE:
            return DIAGNOSIS;
        case MAINTENANCE_VALUE:
            return MAINTENANCE;
        case TEST_VALUE:
            return TEST;
        case OTHER_VALUE:
            return OTHER;
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
    private ProcedureKind( int value, String name, String literal ) {
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

} //ProcedureKind
