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
 * A representation of the literals of the enumeration '<em><b>Asset Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAssetKind()
 * @model
 * @generated
 */
public enum AssetKind implements Enumerator {
    /**
     * The '<em><b>Breaker Air Blast Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_AIR_BLAST_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BREAKER_AIR_BLAST_BREAKER( 0, "breakerAirBlastBreaker", "breakerAirBlastBreaker" ),

    /**
     * The '<em><b>Breaker Bulk Oil Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_BULK_OIL_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BREAKER_BULK_OIL_BREAKER( 1, "breakerBulkOilBreaker", "breakerBulkOilBreaker" ),

    /**
     * The '<em><b>Breaker Minimum Oil Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_MINIMUM_OIL_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BREAKER_MINIMUM_OIL_BREAKER( 2, "breakerMinimumOilBreaker", "breakerMinimumOilBreaker" ),

    /**
     * The '<em><b>Breaker SF6 Dead Tank Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_SF6_DEAD_TANK_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BREAKER_SF6_DEAD_TANK_BREAKER( 3, "breakerSF6DeadTankBreaker", "breakerSF6DeadTankBreaker" ),

    /**
     * The '<em><b>Breaker SF6 Live Tank Breaker</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_SF6_LIVE_TANK_BREAKER_VALUE
     * @generated
     * @ordered
     */
    BREAKER_SF6_LIVE_TANK_BREAKER( 4, "breakerSF6LiveTankBreaker", "breakerSF6LiveTankBreaker" ),

    /**
     * The '<em><b>Breaker Tank Assembly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_TANK_ASSEMBLY_VALUE
     * @generated
     * @ordered
     */
    BREAKER_TANK_ASSEMBLY( 5, "breakerTankAssembly", "breakerTankAssembly" ),

    /**
     * The '<em><b>Breaker Insulating Stack Assembly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BREAKER_INSULATING_STACK_ASSEMBLY_VALUE
     * @generated
     * @ordered
     */
    BREAKER_INSULATING_STACK_ASSEMBLY( 6, "breakerInsulatingStackAssembly", "breakerInsulatingStackAssembly" ),

    /**
     * The '<em><b>Transformer</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_VALUE
     * @generated
     * @ordered
     */
    TRANSFORMER( 7, "transformer", "transformer" ),

    /**
     * The '<em><b>Transformer Tank</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_TANK_VALUE
     * @generated
     * @ordered
     */
    TRANSFORMER_TANK( 8, "transformerTank", "transformerTank" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 9, "other", "other" );

    /**
     * The '<em><b>Breaker Air Blast Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Air Blast Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_AIR_BLAST_BREAKER
     * @model name="breakerAirBlastBreaker"
     * @generated
     * @ordered
     */
    public static final int BREAKER_AIR_BLAST_BREAKER_VALUE = 0;

    /**
     * The '<em><b>Breaker Bulk Oil Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Bulk Oil Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_BULK_OIL_BREAKER
     * @model name="breakerBulkOilBreaker"
     * @generated
     * @ordered
     */
    public static final int BREAKER_BULK_OIL_BREAKER_VALUE = 1;

    /**
     * The '<em><b>Breaker Minimum Oil Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Minimum Oil Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_MINIMUM_OIL_BREAKER
     * @model name="breakerMinimumOilBreaker"
     * @generated
     * @ordered
     */
    public static final int BREAKER_MINIMUM_OIL_BREAKER_VALUE = 2;

    /**
     * The '<em><b>Breaker SF6 Dead Tank Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker SF6 Dead Tank Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_SF6_DEAD_TANK_BREAKER
     * @model name="breakerSF6DeadTankBreaker"
     * @generated
     * @ordered
     */
    public static final int BREAKER_SF6_DEAD_TANK_BREAKER_VALUE = 3;

    /**
     * The '<em><b>Breaker SF6 Live Tank Breaker</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker SF6 Live Tank Breaker</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_SF6_LIVE_TANK_BREAKER
     * @model name="breakerSF6LiveTankBreaker"
     * @generated
     * @ordered
     */
    public static final int BREAKER_SF6_LIVE_TANK_BREAKER_VALUE = 4;

    /**
     * The '<em><b>Breaker Tank Assembly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Tank Assembly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_TANK_ASSEMBLY
     * @model name="breakerTankAssembly"
     * @generated
     * @ordered
     */
    public static final int BREAKER_TANK_ASSEMBLY_VALUE = 5;

    /**
     * The '<em><b>Breaker Insulating Stack Assembly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Breaker Insulating Stack Assembly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BREAKER_INSULATING_STACK_ASSEMBLY
     * @model name="breakerInsulatingStackAssembly"
     * @generated
     * @ordered
     */
    public static final int BREAKER_INSULATING_STACK_ASSEMBLY_VALUE = 6;

    /**
     * The '<em><b>Transformer</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transformer</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSFORMER
     * @model name="transformer"
     * @generated
     * @ordered
     */
    public static final int TRANSFORMER_VALUE = 7;

    /**
     * The '<em><b>Transformer Tank</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Transformer Tank</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TRANSFORMER_TANK
     * @model name="transformerTank"
     * @generated
     * @ordered
     */
    public static final int TRANSFORMER_TANK_VALUE = 8;

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
    public static final int OTHER_VALUE = 9;

    /**
     * An array of all the '<em><b>Asset Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AssetKind[] VALUES_ARRAY = new AssetKind[] { BREAKER_AIR_BLAST_BREAKER,
            BREAKER_BULK_OIL_BREAKER, BREAKER_MINIMUM_OIL_BREAKER, BREAKER_SF6_DEAD_TANK_BREAKER,
            BREAKER_SF6_LIVE_TANK_BREAKER, BREAKER_TANK_ASSEMBLY, BREAKER_INSULATING_STACK_ASSEMBLY, TRANSFORMER,
            TRANSFORMER_TANK, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Asset Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< AssetKind > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Asset Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            AssetKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Asset Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AssetKind get( int value ) {
        switch( value ) {
        case BREAKER_AIR_BLAST_BREAKER_VALUE:
            return BREAKER_AIR_BLAST_BREAKER;
        case BREAKER_BULK_OIL_BREAKER_VALUE:
            return BREAKER_BULK_OIL_BREAKER;
        case BREAKER_MINIMUM_OIL_BREAKER_VALUE:
            return BREAKER_MINIMUM_OIL_BREAKER;
        case BREAKER_SF6_DEAD_TANK_BREAKER_VALUE:
            return BREAKER_SF6_DEAD_TANK_BREAKER;
        case BREAKER_SF6_LIVE_TANK_BREAKER_VALUE:
            return BREAKER_SF6_LIVE_TANK_BREAKER;
        case BREAKER_TANK_ASSEMBLY_VALUE:
            return BREAKER_TANK_ASSEMBLY;
        case BREAKER_INSULATING_STACK_ASSEMBLY_VALUE:
            return BREAKER_INSULATING_STACK_ASSEMBLY;
        case TRANSFORMER_VALUE:
            return TRANSFORMER;
        case TRANSFORMER_TANK_VALUE:
            return TRANSFORMER_TANK;
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
    private AssetKind( int value, String name, String literal ) {
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

} //AssetKind
