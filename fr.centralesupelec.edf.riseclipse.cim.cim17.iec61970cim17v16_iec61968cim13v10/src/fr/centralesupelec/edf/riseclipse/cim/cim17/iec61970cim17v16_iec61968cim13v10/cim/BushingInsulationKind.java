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
 * A representation of the literals of the enumeration '<em><b>Bushing Insulation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBushingInsulationKind()
 * @model
 * @generated
 */
public enum BushingInsulationKind implements Enumerator {
    /**
     * The '<em><b>Oil Impregnated Paper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_IMPREGNATED_PAPER_VALUE
     * @generated
     * @ordered
     */
    OIL_IMPREGNATED_PAPER( 0, "oilImpregnatedPaper", "oilImpregnatedPaper" ),

    /**
     * The '<em><b>Compound</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPOUND_VALUE
     * @generated
     * @ordered
     */
    COMPOUND( 1, "compound", "compound" ),

    /**
     * The '<em><b>Resin Bonded Paper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIN_BONDED_PAPER_VALUE
     * @generated
     * @ordered
     */
    RESIN_BONDED_PAPER( 2, "resinBondedPaper", "resinBondedPaper" ),

    /**
     * The '<em><b>Resin Impregnated Paper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESIN_IMPREGNATED_PAPER_VALUE
     * @generated
     * @ordered
     */
    RESIN_IMPREGNATED_PAPER( 3, "resinImpregnatedPaper", "resinImpregnatedPaper" ),

    /**
     * The '<em><b>Solid Porcelain</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLID_PORCELAIN_VALUE
     * @generated
     * @ordered
     */
    SOLID_PORCELAIN( 4, "solidPorcelain", "solidPorcelain" ),

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
     * The '<em><b>Oil Impregnated Paper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Impregnated Paper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_IMPREGNATED_PAPER
     * @model name="oilImpregnatedPaper"
     * @generated
     * @ordered
     */
    public static final int OIL_IMPREGNATED_PAPER_VALUE = 0;

    /**
     * The '<em><b>Compound</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Compound</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPOUND
     * @model name="compound"
     * @generated
     * @ordered
     */
    public static final int COMPOUND_VALUE = 1;

    /**
     * The '<em><b>Resin Bonded Paper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Resin Bonded Paper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIN_BONDED_PAPER
     * @model name="resinBondedPaper"
     * @generated
     * @ordered
     */
    public static final int RESIN_BONDED_PAPER_VALUE = 2;

    /**
     * The '<em><b>Resin Impregnated Paper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Resin Impregnated Paper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESIN_IMPREGNATED_PAPER
     * @model name="resinImpregnatedPaper"
     * @generated
     * @ordered
     */
    public static final int RESIN_IMPREGNATED_PAPER_VALUE = 3;

    /**
     * The '<em><b>Solid Porcelain</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Solid Porcelain</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLID_PORCELAIN
     * @model name="solidPorcelain"
     * @generated
     * @ordered
     */
    public static final int SOLID_PORCELAIN_VALUE = 4;

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
     * An array of all the '<em><b>Bushing Insulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final BushingInsulationKind[] VALUES_ARRAY = new BushingInsulationKind[] { OIL_IMPREGNATED_PAPER,
            COMPOUND, RESIN_BONDED_PAPER, RESIN_IMPREGNATED_PAPER, SOLID_PORCELAIN, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Bushing Insulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< BushingInsulationKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Bushing Insulation Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BushingInsulationKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BushingInsulationKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Bushing Insulation Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BushingInsulationKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            BushingInsulationKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Bushing Insulation Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static BushingInsulationKind get( int value ) {
        switch( value ) {
        case OIL_IMPREGNATED_PAPER_VALUE:
            return OIL_IMPREGNATED_PAPER;
        case COMPOUND_VALUE:
            return COMPOUND;
        case RESIN_BONDED_PAPER_VALUE:
            return RESIN_BONDED_PAPER;
        case RESIN_IMPREGNATED_PAPER_VALUE:
            return RESIN_IMPREGNATED_PAPER;
        case SOLID_PORCELAIN_VALUE:
            return SOLID_PORCELAIN;
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
    private BushingInsulationKind( int value, String name, String literal ) {
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

} //BushingInsulationKind
