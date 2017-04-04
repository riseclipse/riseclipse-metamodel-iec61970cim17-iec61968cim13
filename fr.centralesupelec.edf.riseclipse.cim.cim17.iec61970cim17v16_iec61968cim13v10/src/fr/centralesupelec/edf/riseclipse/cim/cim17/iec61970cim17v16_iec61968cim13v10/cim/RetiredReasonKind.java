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
 * A representation of the literals of the enumeration '<em><b>Retired Reason Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRetiredReasonKind()
 * @model
 * @generated
 */
public enum RetiredReasonKind implements Enumerator {
    /**
     * The '<em><b>Environmental</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENVIRONMENTAL_VALUE
     * @generated
     * @ordered
     */
    ENVIRONMENTAL( 0, "environmental", "environmental" ),

    /**
     * The '<em><b>Excessive Maintenance</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXCESSIVE_MAINTENANCE_VALUE
     * @generated
     * @ordered
     */
    EXCESSIVE_MAINTENANCE( 1, "excessiveMaintenance", "excessiveMaintenance" ),

    /**
     * The '<em><b>Facilities Upgrade</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FACILITIES_UPGRADE_VALUE
     * @generated
     * @ordered
     */
    FACILITIES_UPGRADE( 2, "facilitiesUpgrade", "facilitiesUpgrade" ),

    /**
     * The '<em><b>Failed</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAILED_VALUE
     * @generated
     * @ordered
     */
    FAILED( 3, "failed", "failed" ),

    /**
     * The '<em><b>Obsolescence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OBSOLESCENCE_VALUE
     * @generated
     * @ordered
     */
    OBSOLESCENCE( 4, "obsolescence", "obsolescence" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 5, "other", "other" ),

    /**
     * The '<em><b>Sold</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLD_VALUE
     * @generated
     * @ordered
     */
    SOLD( 6, "sold", "sold" );

    /**
     * The '<em><b>Environmental</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Environmental</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENVIRONMENTAL
     * @model name="environmental"
     * @generated
     * @ordered
     */
    public static final int ENVIRONMENTAL_VALUE = 0;

    /**
     * The '<em><b>Excessive Maintenance</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Excessive Maintenance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXCESSIVE_MAINTENANCE
     * @model name="excessiveMaintenance"
     * @generated
     * @ordered
     */
    public static final int EXCESSIVE_MAINTENANCE_VALUE = 1;

    /**
     * The '<em><b>Facilities Upgrade</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Facilities Upgrade</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FACILITIES_UPGRADE
     * @model name="facilitiesUpgrade"
     * @generated
     * @ordered
     */
    public static final int FACILITIES_UPGRADE_VALUE = 2;

    /**
     * The '<em><b>Failed</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Failed</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAILED
     * @model name="failed"
     * @generated
     * @ordered
     */
    public static final int FAILED_VALUE = 3;

    /**
     * The '<em><b>Obsolescence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Obsolescence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OBSOLESCENCE
     * @model name="obsolescence"
     * @generated
     * @ordered
     */
    public static final int OBSOLESCENCE_VALUE = 4;

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
    public static final int OTHER_VALUE = 5;

    /**
     * The '<em><b>Sold</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sold</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLD
     * @model name="sold"
     * @generated
     * @ordered
     */
    public static final int SOLD_VALUE = 6;

    /**
     * An array of all the '<em><b>Retired Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RetiredReasonKind[] VALUES_ARRAY = new RetiredReasonKind[] { ENVIRONMENTAL,
            EXCESSIVE_MAINTENANCE, FACILITIES_UPGRADE, FAILED, OBSOLESCENCE, OTHER, SOLD, };

    /**
     * A public read-only list of all the '<em><b>Retired Reason Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RetiredReasonKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Retired Reason Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RetiredReasonKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RetiredReasonKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Retired Reason Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RetiredReasonKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RetiredReasonKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Retired Reason Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RetiredReasonKind get( int value ) {
        switch( value ) {
        case ENVIRONMENTAL_VALUE:
            return ENVIRONMENTAL;
        case EXCESSIVE_MAINTENANCE_VALUE:
            return EXCESSIVE_MAINTENANCE;
        case FACILITIES_UPGRADE_VALUE:
            return FACILITIES_UPGRADE;
        case FAILED_VALUE:
            return FAILED;
        case OBSOLESCENCE_VALUE:
            return OBSOLESCENCE;
        case OTHER_VALUE:
            return OTHER;
        case SOLD_VALUE:
            return SOLD;
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
    private RetiredReasonKind( int value, String name, String literal ) {
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

} //RetiredReasonKind
