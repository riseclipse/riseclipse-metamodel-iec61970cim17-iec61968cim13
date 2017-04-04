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
 * A representation of the literals of the enumeration '<em><b>Breaker Maintenance Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBreakerMaintenanceKind()
 * @model
 * @generated
 */
public enum BreakerMaintenanceKind implements Enumerator {
    /**
     * The '<em><b>External Out Of Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTERNAL_OUT_OF_SERVICE_VALUE
     * @generated
     * @ordered
     */
    EXTERNAL_OUT_OF_SERVICE( 0, "externalOutOfService", "externalOutOfService" ),

    /**
     * The '<em><b>Internal Out Of Service</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERNAL_OUT_OF_SERVICE_VALUE
     * @generated
     * @ordered
     */
    INTERNAL_OUT_OF_SERVICE( 1, "internalOutOfService", "internalOutOfService" ),

    /**
     * The '<em><b>Interrupter Overhaul</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_OVERHAUL_VALUE
     * @generated
     * @ordered
     */
    INTERRUPTER_OVERHAUL( 2, "interrupterOverhaul", "interrupterOverhaul" );

    /**
     * The '<em><b>External Out Of Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>External Out Of Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTERNAL_OUT_OF_SERVICE
     * @model name="externalOutOfService"
     * @generated
     * @ordered
     */
    public static final int EXTERNAL_OUT_OF_SERVICE_VALUE = 0;

    /**
     * The '<em><b>Internal Out Of Service</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Internal Out Of Service</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERNAL_OUT_OF_SERVICE
     * @model name="internalOutOfService"
     * @generated
     * @ordered
     */
    public static final int INTERNAL_OUT_OF_SERVICE_VALUE = 1;

    /**
     * The '<em><b>Interrupter Overhaul</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interrupter Overhaul</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERRUPTER_OVERHAUL
     * @model name="interrupterOverhaul"
     * @generated
     * @ordered
     */
    public static final int INTERRUPTER_OVERHAUL_VALUE = 2;

    /**
     * An array of all the '<em><b>Breaker Maintenance Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BreakerMaintenanceKind[] VALUES_ARRAY = new BreakerMaintenanceKind[] { EXTERNAL_OUT_OF_SERVICE,
            INTERNAL_OUT_OF_SERVICE, INTERRUPTER_OVERHAUL, };

    /**
     * A public read-only list of all the '<em><b>Breaker Maintenance Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BreakerMaintenanceKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Breaker Maintenance Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerMaintenanceKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerMaintenanceKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Maintenance Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerMaintenanceKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerMaintenanceKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Maintenance Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerMaintenanceKind get( int value ) {
        switch( value ) {
        case EXTERNAL_OUT_OF_SERVICE_VALUE:
            return EXTERNAL_OUT_OF_SERVICE;
        case INTERNAL_OUT_OF_SERVICE_VALUE:
            return INTERNAL_OUT_OF_SERVICE;
        case INTERRUPTER_OVERHAUL_VALUE:
            return INTERRUPTER_OVERHAUL;
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
    private BreakerMaintenanceKind( int value, String name, String literal ) {
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

} //BreakerMaintenanceKind
