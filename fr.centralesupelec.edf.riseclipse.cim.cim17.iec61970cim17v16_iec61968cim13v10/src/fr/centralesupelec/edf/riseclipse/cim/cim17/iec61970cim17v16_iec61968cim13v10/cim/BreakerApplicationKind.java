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
 * A representation of the literals of the enumeration '<em><b>Breaker Application Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBreakerApplicationKind()
 * @model
 * @generated
 */
public enum BreakerApplicationKind implements Enumerator {
    /**
     * The '<em><b>Capacitor Or Reactor Bank Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CAPACITOR_OR_REACTOR_BANK_BREAKER_VALUE
     * @generated
     * @ordered
     */
    CAPACITOR_OR_REACTOR_BANK_BREAKER( 0, "capacitorOrReactorBankBreaker", "capacitorOrReactorBankBreaker" ),

    /**
     * The '<em><b>Bus Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BUS_BREAKER( 1, "busBreaker", "busBreaker" ),

    /**
     * The '<em><b>Bus Tie Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUS_TIE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BUS_TIE_BREAKER( 2, "busTieBreaker", "busTieBreaker" ),

    /**
     * The '<em><b>Feeder Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FEEDER_BREAKER_VALUE
     * @generated
     * @ordered
     */
    FEEDER_BREAKER( 3, "feederBreaker", "feederBreaker" ),

    /**
     * The '<em><b>Step Up Transformer Breaker Hydro</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_HYDRO_VALUE
     * @generated
     * @ordered
     */
    STEP_UP_TRANSFORMER_BREAKER_HYDRO( 4, "stepUpTransformerBreakerHydro", "stepUpTransformerBreakerHydro" ),

    /**
     * The '<em><b>Step Up Transformer Breaker Fossil</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_FOSSIL_VALUE
     * @generated
     * @ordered
     */
    STEP_UP_TRANSFORMER_BREAKER_FOSSIL( 5, "stepUpTransformerBreakerFossil", "stepUpTransformerBreakerFossil" ),

    /**
     * The '<em><b>Step Up Transformer Breaker Nuclear</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_NUCLEAR_VALUE
     * @generated
     * @ordered
     */
    STEP_UP_TRANSFORMER_BREAKER_NUCLEAR( 6, "stepUpTransformerBreakerNuclear", "stepUpTransformerBreakerNuclear" ),

    /**
     * The '<em><b>Step Up Transformer Breaker Pumped Storage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE_VALUE
     * @generated
     * @ordered
     */
    STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE( 7, "stepUpTransformerBreakerPumpedStorage",
            "stepUpTransformerBreakerPumpedStorage" ),

    /**
     * The '<em><b>Substation Transformer Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUBSTATION_TRANSFORMER_BREAKER_VALUE
     * @generated
     * @ordered
     */
    SUBSTATION_TRANSFORMER_BREAKER( 8, "substationTransformerBreaker", "substationTransformerBreaker" ),

    /**
     * The '<em><b>Transmission Flow Gate Line Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_FLOW_GATE_LINE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    TRANSMISSION_FLOW_GATE_LINE_BREAKER( 9, "transmissionFlowGateLineBreaker", "transmissionFlowGateLineBreaker" ),

    /**
     * The '<em><b>Transmission Line Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_LINE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    TRANSMISSION_LINE_BREAKER( 10, "transmissionLineBreaker", "transmissionLineBreaker" ),

    /**
     * The '<em><b>Transmission Tie Line Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_TIE_LINE_BREAKER_VALUE
     * @generated
     * @ordered
     */
    TRANSMISSION_TIE_LINE_BREAKER( 11, "transmissionTieLineBreaker", "transmissionTieLineBreaker" ),

    /**
     * The '<em><b>Spare</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPARE_VALUE
     * @generated
     * @ordered
     */
    SPARE( 12, "spare", "spare" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 13, "other", "other" );

    /**
     * The '<em><b>Capacitor Or Reactor Bank Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Capacitor Or Reactor Bank Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CAPACITOR_OR_REACTOR_BANK_BREAKER
     * @model name="capacitorOrReactorBankBreaker"
     * @generated
     * @ordered
     */
    public static final int CAPACITOR_OR_REACTOR_BANK_BREAKER_VALUE = 0;

    /**
     * The '<em><b>Bus Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_BREAKER
     * @model name="busBreaker"
     * @generated
     * @ordered
     */
    public static final int BUS_BREAKER_VALUE = 1;

    /**
     * The '<em><b>Bus Tie Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bus Tie Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUS_TIE_BREAKER
     * @model name="busTieBreaker"
     * @generated
     * @ordered
     */
    public static final int BUS_TIE_BREAKER_VALUE = 2;

    /**
     * The '<em><b>Feeder Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Feeder Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FEEDER_BREAKER
     * @model name="feederBreaker"
     * @generated
     * @ordered
     */
    public static final int FEEDER_BREAKER_VALUE = 3;

    /**
     * The '<em><b>Step Up Transformer Breaker Hydro</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Step Up Transformer Breaker Hydro</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_HYDRO
     * @model name="stepUpTransformerBreakerHydro"
     * @generated
     * @ordered
     */
    public static final int STEP_UP_TRANSFORMER_BREAKER_HYDRO_VALUE = 4;

    /**
     * The '<em><b>Step Up Transformer Breaker Fossil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Step Up Transformer Breaker Fossil</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_FOSSIL
     * @model name="stepUpTransformerBreakerFossil"
     * @generated
     * @ordered
     */
    public static final int STEP_UP_TRANSFORMER_BREAKER_FOSSIL_VALUE = 5;

    /**
     * The '<em><b>Step Up Transformer Breaker Nuclear</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Step Up Transformer Breaker Nuclear</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_NUCLEAR
     * @model name="stepUpTransformerBreakerNuclear"
     * @generated
     * @ordered
     */
    public static final int STEP_UP_TRANSFORMER_BREAKER_NUCLEAR_VALUE = 6;

    /**
     * The '<em><b>Step Up Transformer Breaker Pumped Storage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Step Up Transformer Breaker Pumped Storage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE
     * @model name="stepUpTransformerBreakerPumpedStorage"
     * @generated
     * @ordered
     */
    public static final int STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE_VALUE = 7;

    /**
     * The '<em><b>Substation Transformer Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Substation Transformer Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUBSTATION_TRANSFORMER_BREAKER
     * @model name="substationTransformerBreaker"
     * @generated
     * @ordered
     */
    public static final int SUBSTATION_TRANSFORMER_BREAKER_VALUE = 8;

    /**
     * The '<em><b>Transmission Flow Gate Line Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transmission Flow Gate Line Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_FLOW_GATE_LINE_BREAKER
     * @model name="transmissionFlowGateLineBreaker"
     * @generated
     * @ordered
     */
    public static final int TRANSMISSION_FLOW_GATE_LINE_BREAKER_VALUE = 9;

    /**
     * The '<em><b>Transmission Line Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transmission Line Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_LINE_BREAKER
     * @model name="transmissionLineBreaker"
     * @generated
     * @ordered
     */
    public static final int TRANSMISSION_LINE_BREAKER_VALUE = 10;

    /**
     * The '<em><b>Transmission Tie Line Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transmission Tie Line Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSMISSION_TIE_LINE_BREAKER
     * @model name="transmissionTieLineBreaker"
     * @generated
     * @ordered
     */
    public static final int TRANSMISSION_TIE_LINE_BREAKER_VALUE = 11;

    /**
     * The '<em><b>Spare</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Spare</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPARE
     * @model name="spare"
     * @generated
     * @ordered
     */
    public static final int SPARE_VALUE = 12;

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
    public static final int OTHER_VALUE = 13;

    /**
     * An array of all the '<em><b>Breaker Application Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BreakerApplicationKind[] VALUES_ARRAY = new BreakerApplicationKind[] {
            CAPACITOR_OR_REACTOR_BANK_BREAKER, BUS_BREAKER, BUS_TIE_BREAKER, FEEDER_BREAKER,
            STEP_UP_TRANSFORMER_BREAKER_HYDRO, STEP_UP_TRANSFORMER_BREAKER_FOSSIL, STEP_UP_TRANSFORMER_BREAKER_NUCLEAR,
            STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE, SUBSTATION_TRANSFORMER_BREAKER,
            TRANSMISSION_FLOW_GATE_LINE_BREAKER, TRANSMISSION_LINE_BREAKER, TRANSMISSION_TIE_LINE_BREAKER, SPARE,
            OTHER, };

    /**
     * A public read-only list of all the '<em><b>Breaker Application Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BreakerApplicationKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Breaker Application Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerApplicationKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerApplicationKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Application Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerApplicationKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BreakerApplicationKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Breaker Application Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BreakerApplicationKind get( int value ) {
        switch( value ) {
        case CAPACITOR_OR_REACTOR_BANK_BREAKER_VALUE:
            return CAPACITOR_OR_REACTOR_BANK_BREAKER;
        case BUS_BREAKER_VALUE:
            return BUS_BREAKER;
        case BUS_TIE_BREAKER_VALUE:
            return BUS_TIE_BREAKER;
        case FEEDER_BREAKER_VALUE:
            return FEEDER_BREAKER;
        case STEP_UP_TRANSFORMER_BREAKER_HYDRO_VALUE:
            return STEP_UP_TRANSFORMER_BREAKER_HYDRO;
        case STEP_UP_TRANSFORMER_BREAKER_FOSSIL_VALUE:
            return STEP_UP_TRANSFORMER_BREAKER_FOSSIL;
        case STEP_UP_TRANSFORMER_BREAKER_NUCLEAR_VALUE:
            return STEP_UP_TRANSFORMER_BREAKER_NUCLEAR;
        case STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE_VALUE:
            return STEP_UP_TRANSFORMER_BREAKER_PUMPED_STORAGE;
        case SUBSTATION_TRANSFORMER_BREAKER_VALUE:
            return SUBSTATION_TRANSFORMER_BREAKER;
        case TRANSMISSION_FLOW_GATE_LINE_BREAKER_VALUE:
            return TRANSMISSION_FLOW_GATE_LINE_BREAKER;
        case TRANSMISSION_LINE_BREAKER_VALUE:
            return TRANSMISSION_LINE_BREAKER;
        case TRANSMISSION_TIE_LINE_BREAKER_VALUE:
            return TRANSMISSION_TIE_LINE_BREAKER;
        case SPARE_VALUE:
            return SPARE;
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
    private BreakerApplicationKind( int value, String name, String literal ) {
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

} //BreakerApplicationKind
