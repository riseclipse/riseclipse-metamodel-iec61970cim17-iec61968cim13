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
 * A representation of the literals of the enumeration '<em><b>Analytic Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticKind()
 * @model
 * @generated
 */
public enum AnalyticKind implements Enumerator {
    /**
     * The '<em><b>Risk Analytic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RISK_ANALYTIC_VALUE
     * @generated
     * @ordered
     */
    RISK_ANALYTIC( 0, "riskAnalytic", "riskAnalytic" ),

    /**
     * The '<em><b>Fault Analytic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAULT_ANALYTIC_VALUE
     * @generated
     * @ordered
     */
    FAULT_ANALYTIC( 1, "faultAnalytic", "faultAnalytic" ),

    /**
     * The '<em><b>Aging Analytic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AGING_ANALYTIC_VALUE
     * @generated
     * @ordered
     */
    AGING_ANALYTIC( 2, "agingAnalytic", "agingAnalytic" ),

    /**
     * The '<em><b>Health Analytic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEALTH_ANALYTIC_VALUE
     * @generated
     * @ordered
     */
    HEALTH_ANALYTIC( 3, "healthAnalytic", "healthAnalytic" ),

    /**
     * The '<em><b>Replacement Analytic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REPLACEMENT_ANALYTIC_VALUE
     * @generated
     * @ordered
     */
    REPLACEMENT_ANALYTIC( 4, "replacementAnalytic", "replacementAnalytic" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 5, "other", "other" );

    /**
     * The '<em><b>Risk Analytic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Risk Analytic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RISK_ANALYTIC
     * @model name="riskAnalytic"
     * @generated
     * @ordered
     */
    public static final int RISK_ANALYTIC_VALUE = 0;

    /**
     * The '<em><b>Fault Analytic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fault Analytic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAULT_ANALYTIC
     * @model name="faultAnalytic"
     * @generated
     * @ordered
     */
    public static final int FAULT_ANALYTIC_VALUE = 1;

    /**
     * The '<em><b>Aging Analytic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aging Analytic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AGING_ANALYTIC
     * @model name="agingAnalytic"
     * @generated
     * @ordered
     */
    public static final int AGING_ANALYTIC_VALUE = 2;

    /**
     * The '<em><b>Health Analytic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Health Analytic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEALTH_ANALYTIC
     * @model name="healthAnalytic"
     * @generated
     * @ordered
     */
    public static final int HEALTH_ANALYTIC_VALUE = 3;

    /**
     * The '<em><b>Replacement Analytic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Replacement Analytic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REPLACEMENT_ANALYTIC
     * @model name="replacementAnalytic"
     * @generated
     * @ordered
     */
    public static final int REPLACEMENT_ANALYTIC_VALUE = 4;

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
     * An array of all the '<em><b>Analytic Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AnalyticKind[] VALUES_ARRAY = new AnalyticKind[] { RISK_ANALYTIC, FAULT_ANALYTIC,
            AGING_ANALYTIC, HEALTH_ANALYTIC, REPLACEMENT_ANALYTIC, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Analytic Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AnalyticKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Analytic Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AnalyticKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AnalyticKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Analytic Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AnalyticKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AnalyticKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Analytic Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AnalyticKind get( int value ) {
        switch( value ) {
        case RISK_ANALYTIC_VALUE:
            return RISK_ANALYTIC;
        case FAULT_ANALYTIC_VALUE:
            return FAULT_ANALYTIC;
        case AGING_ANALYTIC_VALUE:
            return AGING_ANALYTIC;
        case HEALTH_ANALYTIC_VALUE:
            return HEALTH_ANALYTIC;
        case REPLACEMENT_ANALYTIC_VALUE:
            return REPLACEMENT_ANALYTIC;
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
    private AnalyticKind( int value, String name, String literal ) {
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

} //AnalyticKind
