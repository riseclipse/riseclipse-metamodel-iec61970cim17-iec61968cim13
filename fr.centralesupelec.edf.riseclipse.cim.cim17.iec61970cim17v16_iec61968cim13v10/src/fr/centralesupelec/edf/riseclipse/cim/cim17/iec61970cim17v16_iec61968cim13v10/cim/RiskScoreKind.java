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
 * A representation of the literals of the enumeration '<em><b>Risk Score Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRiskScoreKind()
 * @model
 * @generated
 */
public enum RiskScoreKind implements Enumerator {
    /**
     * The '<em><b>Customer Risk</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CUSTOMER_RISK_VALUE
     * @generated
     * @ordered
     */
    CUSTOMER_RISK( 0, "customerRisk", "customerRisk" ),

    /**
     * The '<em><b>Financial Risk</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FINANCIAL_RISK_VALUE
     * @generated
     * @ordered
     */
    FINANCIAL_RISK( 1, "financialRisk", "financialRisk" ),

    /**
     * The '<em><b>Safety Risk</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SAFETY_RISK_VALUE
     * @generated
     * @ordered
     */
    SAFETY_RISK( 2, "safetyRisk", "safetyRisk" );

    /**
     * The '<em><b>Customer Risk</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Customer Risk</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CUSTOMER_RISK
     * @model name="customerRisk"
     * @generated
     * @ordered
     */
    public static final int CUSTOMER_RISK_VALUE = 0;

    /**
     * The '<em><b>Financial Risk</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Financial Risk</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FINANCIAL_RISK
     * @model name="financialRisk"
     * @generated
     * @ordered
     */
    public static final int FINANCIAL_RISK_VALUE = 1;

    /**
     * The '<em><b>Safety Risk</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Safety Risk</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SAFETY_RISK
     * @model name="safetyRisk"
     * @generated
     * @ordered
     */
    public static final int SAFETY_RISK_VALUE = 2;

    /**
     * An array of all the '<em><b>Risk Score Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RiskScoreKind[] VALUES_ARRAY = new RiskScoreKind[] { CUSTOMER_RISK, FINANCIAL_RISK,
            SAFETY_RISK, };

    /**
     * A public read-only list of all the '<em><b>Risk Score Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< RiskScoreKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Risk Score Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RiskScoreKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RiskScoreKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Risk Score Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RiskScoreKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            RiskScoreKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Risk Score Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RiskScoreKind get( int value ) {
        switch( value ) {
        case CUSTOMER_RISK_VALUE:
            return CUSTOMER_RISK;
        case FINANCIAL_RISK_VALUE:
            return FINANCIAL_RISK;
        case SAFETY_RISK_VALUE:
            return SAFETY_RISK;
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
    private RiskScoreKind( int value, String name, String literal ) {
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

} //RiskScoreKind
