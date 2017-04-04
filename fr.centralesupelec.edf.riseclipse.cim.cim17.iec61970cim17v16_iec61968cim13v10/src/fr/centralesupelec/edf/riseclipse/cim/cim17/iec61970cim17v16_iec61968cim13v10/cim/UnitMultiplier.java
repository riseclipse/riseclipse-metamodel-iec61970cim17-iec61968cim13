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
 * A representation of the literals of the enumeration '<em><b>Unit Multiplier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getUnitMultiplier()
 * @model
 * @generated
 */
public enum UnitMultiplier implements Enumerator {
    /**
     * The '<em><b>Yocto</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YOCTO_VALUE
     * @generated
     * @ordered
     */
    YOCTO( 0, "yocto", "yocto" ),

    /**
     * The '<em><b>Zepto</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ZEPTO_VALUE
     * @generated
     * @ordered
     */
    ZEPTO( 1, "zepto", "zepto" ),

    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 2, "a", "a" ),

    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #F_VALUE
     * @generated
     * @ordered
     */
    F( 3, "f", "f" ),

    /**
     * The '<em><b>Pico</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PICO_VALUE
     * @generated
     * @ordered
     */
    PICO( 4, "pico", "pico" ),

    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 5, "n", "n" ),

    /**
     * The '<em><b>Micro</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MICRO_VALUE
     * @generated
     * @ordered
     */
    MICRO( 6, "micro", "micro" ),

    /**
     * The '<em><b>Milli</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MILLI_VALUE
     * @generated
     * @ordered
     */
    MILLI( 7, "milli", "milli" ),

    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 8, "c", "c" ),

    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 9, "d", "d" ),

    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 10, "none", "none" ),

    /**
     * The '<em><b>Da</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DA_VALUE
     * @generated
     * @ordered
     */
    DA( 11, "da", "da" ),

    /**
     * The '<em><b>H</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #H_VALUE
     * @generated
     * @ordered
     */
    H( 12, "h", "h" ),

    /**
     * The '<em><b>K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #K_VALUE
     * @generated
     * @ordered
     */
    K( 13, "k", "k" ),

    /**
     * The '<em><b>M</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #M_VALUE
     * @generated
     * @ordered
     */
    M( 14, "M", "M" ),

    /**
     * The '<em><b>G</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #G_VALUE
     * @generated
     * @ordered
     */
    G( 15, "G", "G" ),

    /**
     * The '<em><b>T</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #T_VALUE
     * @generated
     * @ordered
     */
    T( 16, "T", "T" ),

    /**
     * The '<em><b>P</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #P_VALUE
     * @generated
     * @ordered
     */
    P( 17, "P", "P" ),

    /**
     * The '<em><b>E</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #E_VALUE
     * @generated
     * @ordered
     */
    E( 18, "E", "E" ),

    /**
     * The '<em><b>Z</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Z_VALUE
     * @generated
     * @ordered
     */
    Z( 19, "Z", "Z" ),

    /**
     * The '<em><b>Y</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #Y_VALUE
     * @generated
     * @ordered
     */
    Y( 20, "Y", "Y" );

    /**
     * The '<em><b>Yocto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Yocto</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YOCTO
     * @model name="yocto"
     * @generated
     * @ordered
     */
    public static final int YOCTO_VALUE = 0;

    /**
     * The '<em><b>Zepto</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Zepto</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ZEPTO
     * @model name="zepto"
     * @generated
     * @ordered
     */
    public static final int ZEPTO_VALUE = 1;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #A
     * @model name="a"
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 2;

    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>F</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #F
     * @model name="f"
     * @generated
     * @ordered
     */
    public static final int F_VALUE = 3;

    /**
     * The '<em><b>Pico</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pico</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PICO
     * @model name="pico"
     * @generated
     * @ordered
     */
    public static final int PICO_VALUE = 4;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>N</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #N
     * @model name="n"
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 5;

    /**
     * The '<em><b>Micro</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Micro</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MICRO
     * @model name="micro"
     * @generated
     * @ordered
     */
    public static final int MICRO_VALUE = 6;

    /**
     * The '<em><b>Milli</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Milli</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MILLI
     * @model name="milli"
     * @generated
     * @ordered
     */
    public static final int MILLI_VALUE = 7;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #C
     * @model name="c"
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 8;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #D
     * @model name="d"
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 9;

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
    public static final int NONE_VALUE = 10;

    /**
     * The '<em><b>Da</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Da</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DA
     * @model name="da"
     * @generated
     * @ordered
     */
    public static final int DA_VALUE = 11;

    /**
     * The '<em><b>H</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>H</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #H
     * @model name="h"
     * @generated
     * @ordered
     */
    public static final int H_VALUE = 12;

    /**
     * The '<em><b>K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>K</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #K
     * @model name="k"
     * @generated
     * @ordered
     */
    public static final int K_VALUE = 13;

    /**
     * The '<em><b>M</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #M
     * @model
     * @generated
     * @ordered
     */
    public static final int M_VALUE = 14;

    /**
     * The '<em><b>G</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #G
     * @model
     * @generated
     * @ordered
     */
    public static final int G_VALUE = 15;

    /**
     * The '<em><b>T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>T</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #T
     * @model
     * @generated
     * @ordered
     */
    public static final int T_VALUE = 16;

    /**
     * The '<em><b>P</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #P
     * @model
     * @generated
     * @ordered
     */
    public static final int P_VALUE = 17;

    /**
     * The '<em><b>E</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>E</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #E
     * @model
     * @generated
     * @ordered
     */
    public static final int E_VALUE = 18;

    /**
     * The '<em><b>Z</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Z</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Z
     * @model
     * @generated
     * @ordered
     */
    public static final int Z_VALUE = 19;

    /**
     * The '<em><b>Y</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Y</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #Y
     * @model
     * @generated
     * @ordered
     */
    public static final int Y_VALUE = 20;

    /**
     * An array of all the '<em><b>Unit Multiplier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UnitMultiplier[] VALUES_ARRAY = new UnitMultiplier[] { YOCTO, ZEPTO, A, F, PICO, N, MICRO,
            MILLI, C, D, NONE, DA, H, K, M, G, T, P, E, Z, Y, };

    /**
     * A public read-only list of all the '<em><b>Unit Multiplier</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< UnitMultiplier > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UnitMultiplier result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            UnitMultiplier result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Multiplier</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitMultiplier get( int value ) {
        switch( value ) {
        case YOCTO_VALUE:
            return YOCTO;
        case ZEPTO_VALUE:
            return ZEPTO;
        case A_VALUE:
            return A;
        case F_VALUE:
            return F;
        case PICO_VALUE:
            return PICO;
        case N_VALUE:
            return N;
        case MICRO_VALUE:
            return MICRO;
        case MILLI_VALUE:
            return MILLI;
        case C_VALUE:
            return C;
        case D_VALUE:
            return D;
        case NONE_VALUE:
            return NONE;
        case DA_VALUE:
            return DA;
        case H_VALUE:
            return H;
        case K_VALUE:
            return K;
        case M_VALUE:
            return M;
        case G_VALUE:
            return G;
        case T_VALUE:
            return T;
        case P_VALUE:
            return P;
        case E_VALUE:
            return E;
        case Z_VALUE:
            return Z;
        case Y_VALUE:
            return Y;
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
    private UnitMultiplier( int value, String name, String literal ) {
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

} //UnitMultiplier
