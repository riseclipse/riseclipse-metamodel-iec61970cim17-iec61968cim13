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
 * A representation of the literals of the enumeration '<em><b>Flow Direction Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFlowDirectionKind()
 * @model
 * @generated
 */
public enum FlowDirectionKind implements Enumerator {
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 0, "none", "none" ),

    /**
     * The '<em><b>Forward</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FORWARD_VALUE
     * @generated
     * @ordered
     */
    FORWARD( 1, "forward", "forward" ),

    /**
     * The '<em><b>Lagging</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LAGGING_VALUE
     * @generated
     * @ordered
     */
    LAGGING( 2, "lagging", "lagging" ),

    /**
     * The '<em><b>Leading</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LEADING_VALUE
     * @generated
     * @ordered
     */
    LEADING( 3, "leading", "leading" ),

    /**
     * The '<em><b>Net</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NET_VALUE
     * @generated
     * @ordered
     */
    NET( 4, "net", "net" ),

    /**
     * The '<em><b>Q1plus Q2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q2_VALUE
     * @generated
     * @ordered
     */
    Q1PLUS_Q2( 5, "q1plusQ2", "q1plusQ2" ),

    /**
     * The '<em><b>Q1plus Q3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q3_VALUE
     * @generated
     * @ordered
     */
    Q1PLUS_Q3( 6, "q1plusQ3", "q1plusQ3" ),

    /**
     * The '<em><b>Q1plus Q4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q4_VALUE
     * @generated
     * @ordered
     */
    Q1PLUS_Q4( 7, "q1plusQ4", "q1plusQ4" ),

    /**
     * The '<em><b>Q1minus Q4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q1MINUS_Q4_VALUE
     * @generated
     * @ordered
     */
    Q1MINUS_Q4( 8, "q1minusQ4", "q1minusQ4" ),

    /**
     * The '<em><b>Q2plus Q3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q2PLUS_Q3_VALUE
     * @generated
     * @ordered
     */
    Q2PLUS_Q3( 9, "q2plusQ3", "q2plusQ3" ),

    /**
     * The '<em><b>Q2plus Q4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q2PLUS_Q4_VALUE
     * @generated
     * @ordered
     */
    Q2PLUS_Q4( 10, "q2plusQ4", "q2plusQ4" ),

    /**
     * The '<em><b>Q2minus Q3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q2MINUS_Q3_VALUE
     * @generated
     * @ordered
     */
    Q2MINUS_Q3( 11, "q2minusQ3", "q2minusQ3" ),

    /**
     * The '<em><b>Q3plus Q4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q3PLUS_Q4_VALUE
     * @generated
     * @ordered
     */
    Q3PLUS_Q4( 12, "q3plusQ4", "q3plusQ4" ),

    /**
     * The '<em><b>Q3minus Q2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Q3MINUS_Q2_VALUE
     * @generated
     * @ordered
     */
    Q3MINUS_Q2( 13, "q3minusQ2", "q3minusQ2" ),

    /**
     * The '<em><b>Quadrant1</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUADRANT1_VALUE
     * @generated
     * @ordered
     */
    QUADRANT1( 14, "quadrant1", "quadrant1" ),

    /**
     * The '<em><b>Quadrant2</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUADRANT2_VALUE
     * @generated
     * @ordered
     */
    QUADRANT2( 15, "quadrant2", "quadrant2" ),

    /**
     * The '<em><b>Quadrant3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUADRANT3_VALUE
     * @generated
     * @ordered
     */
    QUADRANT3( 16, "quadrant3", "quadrant3" ),

    /**
     * The '<em><b>Quadrant4</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #QUADRANT4_VALUE
     * @generated
     * @ordered
     */
    QUADRANT4( 17, "quadrant4", "quadrant4" ),

    /**
     * The '<em><b>Reverse</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REVERSE_VALUE
     * @generated
     * @ordered
     */
    REVERSE( 18, "reverse", "reverse" ),

    /**
     * The '<em><b>Total</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_VALUE
     * @generated
     * @ordered
     */
    TOTAL( 19, "total", "total" ),

    /**
     * The '<em><b>Total By Phase</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_BY_PHASE_VALUE
     * @generated
     * @ordered
     */
    TOTAL_BY_PHASE( 20, "totalByPhase", "totalByPhase" );

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>Forward</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Forward</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FORWARD
     * @model name="forward"
     * @generated
     * @ordered
     */
    public static final int FORWARD_VALUE = 1;

    /**
     * The '<em><b>Lagging</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Lagging</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LAGGING
     * @model name="lagging"
     * @generated
     * @ordered
     */
    public static final int LAGGING_VALUE = 2;

    /**
     * The '<em><b>Leading</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Leading</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LEADING
     * @model name="leading"
     * @generated
     * @ordered
     */
    public static final int LEADING_VALUE = 3;

    /**
     * The '<em><b>Net</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Net</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NET
     * @model name="net"
     * @generated
     * @ordered
     */
    public static final int NET_VALUE = 4;

    /**
     * The '<em><b>Q1plus Q2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q1plus Q2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q2
     * @model name="q1plusQ2"
     * @generated
     * @ordered
     */
    public static final int Q1PLUS_Q2_VALUE = 5;

    /**
     * The '<em><b>Q1plus Q3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q1plus Q3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q3
     * @model name="q1plusQ3"
     * @generated
     * @ordered
     */
    public static final int Q1PLUS_Q3_VALUE = 6;

    /**
     * The '<em><b>Q1plus Q4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q1plus Q4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q1PLUS_Q4
     * @model name="q1plusQ4"
     * @generated
     * @ordered
     */
    public static final int Q1PLUS_Q4_VALUE = 7;

    /**
     * The '<em><b>Q1minus Q4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q1minus Q4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q1MINUS_Q4
     * @model name="q1minusQ4"
     * @generated
     * @ordered
     */
    public static final int Q1MINUS_Q4_VALUE = 8;

    /**
     * The '<em><b>Q2plus Q3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q2plus Q3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q2PLUS_Q3
     * @model name="q2plusQ3"
     * @generated
     * @ordered
     */
    public static final int Q2PLUS_Q3_VALUE = 9;

    /**
     * The '<em><b>Q2plus Q4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q2plus Q4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q2PLUS_Q4
     * @model name="q2plusQ4"
     * @generated
     * @ordered
     */
    public static final int Q2PLUS_Q4_VALUE = 10;

    /**
     * The '<em><b>Q2minus Q3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q2minus Q3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q2MINUS_Q3
     * @model name="q2minusQ3"
     * @generated
     * @ordered
     */
    public static final int Q2MINUS_Q3_VALUE = 11;

    /**
     * The '<em><b>Q3plus Q4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q3plus Q4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q3PLUS_Q4
     * @model name="q3plusQ4"
     * @generated
     * @ordered
     */
    public static final int Q3PLUS_Q4_VALUE = 12;

    /**
     * The '<em><b>Q3minus Q2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Q3minus Q2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Q3MINUS_Q2
     * @model name="q3minusQ2"
     * @generated
     * @ordered
     */
    public static final int Q3MINUS_Q2_VALUE = 13;

    /**
     * The '<em><b>Quadrant1</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quadrant1</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUADRANT1
     * @model name="quadrant1"
     * @generated
     * @ordered
     */
    public static final int QUADRANT1_VALUE = 14;

    /**
     * The '<em><b>Quadrant2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quadrant2</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUADRANT2
     * @model name="quadrant2"
     * @generated
     * @ordered
     */
    public static final int QUADRANT2_VALUE = 15;

    /**
     * The '<em><b>Quadrant3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quadrant3</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUADRANT3
     * @model name="quadrant3"
     * @generated
     * @ordered
     */
    public static final int QUADRANT3_VALUE = 16;

    /**
     * The '<em><b>Quadrant4</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Quadrant4</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #QUADRANT4
     * @model name="quadrant4"
     * @generated
     * @ordered
     */
    public static final int QUADRANT4_VALUE = 17;

    /**
     * The '<em><b>Reverse</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Reverse</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REVERSE
     * @model name="reverse"
     * @generated
     * @ordered
     */
    public static final int REVERSE_VALUE = 18;

    /**
     * The '<em><b>Total</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL
     * @model name="total"
     * @generated
     * @ordered
     */
    public static final int TOTAL_VALUE = 19;

    /**
     * The '<em><b>Total By Phase</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total By Phase</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_BY_PHASE
     * @model name="totalByPhase"
     * @generated
     * @ordered
     */
    public static final int TOTAL_BY_PHASE_VALUE = 20;

    /**
     * An array of all the '<em><b>Flow Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FlowDirectionKind[] VALUES_ARRAY = new FlowDirectionKind[] { NONE, FORWARD, LAGGING, LEADING,
            NET, Q1PLUS_Q2, Q1PLUS_Q3, Q1PLUS_Q4, Q1MINUS_Q4, Q2PLUS_Q3, Q2PLUS_Q4, Q2MINUS_Q3, Q3PLUS_Q4, Q3MINUS_Q2,
            QUADRANT1, QUADRANT2, QUADRANT3, QUADRANT4, REVERSE, TOTAL, TOTAL_BY_PHASE, };

    /**
     * A public read-only list of all the '<em><b>Flow Direction Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FlowDirectionKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Flow Direction Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FlowDirectionKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FlowDirectionKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Flow Direction Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FlowDirectionKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            FlowDirectionKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Flow Direction Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FlowDirectionKind get( int value ) {
        switch( value ) {
        case NONE_VALUE:
            return NONE;
        case FORWARD_VALUE:
            return FORWARD;
        case LAGGING_VALUE:
            return LAGGING;
        case LEADING_VALUE:
            return LEADING;
        case NET_VALUE:
            return NET;
        case Q1PLUS_Q2_VALUE:
            return Q1PLUS_Q2;
        case Q1PLUS_Q3_VALUE:
            return Q1PLUS_Q3;
        case Q1PLUS_Q4_VALUE:
            return Q1PLUS_Q4;
        case Q1MINUS_Q4_VALUE:
            return Q1MINUS_Q4;
        case Q2PLUS_Q3_VALUE:
            return Q2PLUS_Q3;
        case Q2PLUS_Q4_VALUE:
            return Q2PLUS_Q4;
        case Q2MINUS_Q3_VALUE:
            return Q2MINUS_Q3;
        case Q3PLUS_Q4_VALUE:
            return Q3PLUS_Q4;
        case Q3MINUS_Q2_VALUE:
            return Q3MINUS_Q2;
        case QUADRANT1_VALUE:
            return QUADRANT1;
        case QUADRANT2_VALUE:
            return QUADRANT2;
        case QUADRANT3_VALUE:
            return QUADRANT3;
        case QUADRANT4_VALUE:
            return QUADRANT4;
        case REVERSE_VALUE:
            return REVERSE;
        case TOTAL_VALUE:
            return TOTAL;
        case TOTAL_BY_PHASE_VALUE:
            return TOTAL_BY_PHASE;
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
    private FlowDirectionKind( int value, String name, String literal ) {
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

} //FlowDirectionKind
