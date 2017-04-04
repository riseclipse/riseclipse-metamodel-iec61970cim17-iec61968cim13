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
 * A representation of the literals of the enumeration '<em><b>Ami Billing Ready Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAmiBillingReadyKind()
 * @model
 * @generated
 */
public enum AmiBillingReadyKind implements Enumerator {
    /**
     * The '<em><b>Enabled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENABLED_VALUE
     * @generated
     * @ordered
     */
    ENABLED( 0, "enabled", "enabled" ),

    /**
     * The '<em><b>Operable</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OPERABLE_VALUE
     * @generated
     * @ordered
     */
    OPERABLE( 1, "operable", "operable" ),

    /**
     * The '<em><b>Billing Approved</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BILLING_APPROVED_VALUE
     * @generated
     * @ordered
     */
    BILLING_APPROVED( 2, "billingApproved", "billingApproved" ),

    /**
     * The '<em><b>Non Ami</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NON_AMI_VALUE
     * @generated
     * @ordered
     */
    NON_AMI( 3, "nonAmi", "nonAmi" ),

    /**
     * The '<em><b>Ami Disabled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AMI_DISABLED_VALUE
     * @generated
     * @ordered
     */
    AMI_DISABLED( 4, "amiDisabled", "amiDisabled" ),

    /**
     * The '<em><b>Ami Capable</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AMI_CAPABLE_VALUE
     * @generated
     * @ordered
     */
    AMI_CAPABLE( 5, "amiCapable", "amiCapable" ),

    /**
     * The '<em><b>Non Metered</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NON_METERED_VALUE
     * @generated
     * @ordered
     */
    NON_METERED( 6, "nonMetered", "nonMetered" );

    /**
     * The '<em><b>Enabled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Enabled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENABLED
     * @model name="enabled"
     * @generated
     * @ordered
     */
    public static final int ENABLED_VALUE = 0;

    /**
     * The '<em><b>Operable</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Operable</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OPERABLE
     * @model name="operable"
     * @generated
     * @ordered
     */
    public static final int OPERABLE_VALUE = 1;

    /**
     * The '<em><b>Billing Approved</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Billing Approved</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BILLING_APPROVED
     * @model name="billingApproved"
     * @generated
     * @ordered
     */
    public static final int BILLING_APPROVED_VALUE = 2;

    /**
     * The '<em><b>Non Ami</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Non Ami</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NON_AMI
     * @model name="nonAmi"
     * @generated
     * @ordered
     */
    public static final int NON_AMI_VALUE = 3;

    /**
     * The '<em><b>Ami Disabled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ami Disabled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AMI_DISABLED
     * @model name="amiDisabled"
     * @generated
     * @ordered
     */
    public static final int AMI_DISABLED_VALUE = 4;

    /**
     * The '<em><b>Ami Capable</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ami Capable</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AMI_CAPABLE
     * @model name="amiCapable"
     * @generated
     * @ordered
     */
    public static final int AMI_CAPABLE_VALUE = 5;

    /**
     * The '<em><b>Non Metered</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Non Metered</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NON_METERED
     * @model name="nonMetered"
     * @generated
     * @ordered
     */
    public static final int NON_METERED_VALUE = 6;

    /**
     * An array of all the '<em><b>Ami Billing Ready Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AmiBillingReadyKind[] VALUES_ARRAY = new AmiBillingReadyKind[] { ENABLED, OPERABLE,
            BILLING_APPROVED, NON_AMI, AMI_DISABLED, AMI_CAPABLE, NON_METERED, };

    /**
     * A public read-only list of all the '<em><b>Ami Billing Ready Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AmiBillingReadyKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Ami Billing Ready Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AmiBillingReadyKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AmiBillingReadyKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ami Billing Ready Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AmiBillingReadyKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AmiBillingReadyKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ami Billing Ready Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AmiBillingReadyKind get( int value ) {
        switch( value ) {
        case ENABLED_VALUE:
            return ENABLED;
        case OPERABLE_VALUE:
            return OPERABLE;
        case BILLING_APPROVED_VALUE:
            return BILLING_APPROVED;
        case NON_AMI_VALUE:
            return NON_AMI;
        case AMI_DISABLED_VALUE:
            return AMI_DISABLED;
        case AMI_CAPABLE_VALUE:
            return AMI_CAPABLE;
        case NON_METERED_VALUE:
            return NON_METERED;
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
    private AmiBillingReadyKind( int value, String name, String literal ) {
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

} //AmiBillingReadyKind
