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
 * A representation of the literals of the enumeration '<em><b>Wire Insulation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireInsulationKind()
 * @model
 * @generated
 */
public enum WireInsulationKind implements Enumerator {
    /**
     * The '<em><b>Asbestos And Varnished Cambric</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE
     * @generated
     * @ordered
     */
    ASBESTOS_AND_VARNISHED_CAMBRIC( 0, "asbestosAndVarnishedCambric", "asbestosAndVarnishedCambric" ),

    /**
     * The '<em><b>Butyl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUTYL_VALUE
     * @generated
     * @ordered
     */
    BUTYL( 1, "butyl", "butyl" ),

    /**
     * The '<em><b>Ethylene Propylene Rubber</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ETHYLENE_PROPYLENE_RUBBER_VALUE
     * @generated
     * @ordered
     */
    ETHYLENE_PROPYLENE_RUBBER( 2, "ethylenePropyleneRubber", "ethylenePropyleneRubber" ),

    /**
     * The '<em><b>High Molecular Weight Polyethylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE
     * @generated
     * @ordered
     */
    HIGH_MOLECULAR_WEIGHT_POLYETHYLENE( 3, "highMolecularWeightPolyethylene", "highMolecularWeightPolyethylene" ),

    /**
     * The '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE
     * @generated
     * @ordered
     */
    TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE( 4, "treeResistantHighMolecularWeightPolyethylene",
            "treeResistantHighMolecularWeightPolyethylene" ),

    /**
     * The '<em><b>Low Capacitance Rubber</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOW_CAPACITANCE_RUBBER_VALUE
     * @generated
     * @ordered
     */
    LOW_CAPACITANCE_RUBBER( 5, "lowCapacitanceRubber", "lowCapacitanceRubber" ),

    /**
     * The '<em><b>Oil Paper</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OIL_PAPER_VALUE
     * @generated
     * @ordered
     */
    OIL_PAPER( 6, "oilPaper", "oilPaper" ),

    /**
     * The '<em><b>Ozone Resistant Rubber</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OZONE_RESISTANT_RUBBER_VALUE
     * @generated
     * @ordered
     */
    OZONE_RESISTANT_RUBBER( 7, "ozoneResistantRubber", "ozoneResistantRubber" ),

    /**
     * The '<em><b>Belted Pilc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BELTED_PILC_VALUE
     * @generated
     * @ordered
     */
    BELTED_PILC( 8, "beltedPilc", "beltedPilc" ),

    /**
     * The '<em><b>Unbelted Pilc</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNBELTED_PILC_VALUE
     * @generated
     * @ordered
     */
    UNBELTED_PILC( 9, "unbeltedPilc", "unbeltedPilc" ),

    /**
     * The '<em><b>Rubber</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RUBBER_VALUE
     * @generated
     * @ordered
     */
    RUBBER( 10, "rubber", "rubber" ),

    /**
     * The '<em><b>Silicon Rubber</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SILICON_RUBBER_VALUE
     * @generated
     * @ordered
     */
    SILICON_RUBBER( 11, "siliconRubber", "siliconRubber" ),

    /**
     * The '<em><b>Varnished Cambric Cloth</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARNISHED_CAMBRIC_CLOTH_VALUE
     * @generated
     * @ordered
     */
    VARNISHED_CAMBRIC_CLOTH( 12, "varnishedCambricCloth", "varnishedCambricCloth" ),

    /**
     * The '<em><b>Varnished Dacron Glass</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VARNISHED_DACRON_GLASS_VALUE
     * @generated
     * @ordered
     */
    VARNISHED_DACRON_GLASS( 13, "varnishedDacronGlass", "varnishedDacronGlass" ),

    /**
     * The '<em><b>Crosslinked Polyethylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CROSSLINKED_POLYETHYLENE_VALUE
     * @generated
     * @ordered
     */
    CROSSLINKED_POLYETHYLENE( 14, "crosslinkedPolyethylene", "crosslinkedPolyethylene" ),

    /**
     * The '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE
     * @generated
     * @ordered
     */
    TREE_RETARDANT_CROSSLINKED_POLYETHYLENE( 15, "treeRetardantCrosslinkedPolyethylene",
            "treeRetardantCrosslinkedPolyethylene" ),

    /**
     * The '<em><b>High Pressure Fluid Filled</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HIGH_PRESSURE_FLUID_FILLED_VALUE
     * @generated
     * @ordered
     */
    HIGH_PRESSURE_FLUID_FILLED( 16, "highPressureFluidFilled", "highPressureFluidFilled" ),

    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 17, "other", "other" );

    /**
     * The '<em><b>Asbestos And Varnished Cambric</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Asbestos And Varnished Cambric</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASBESTOS_AND_VARNISHED_CAMBRIC
     * @model name="asbestosAndVarnishedCambric"
     * @generated
     * @ordered
     */
    public static final int ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE = 0;

    /**
     * The '<em><b>Butyl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Butyl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BUTYL
     * @model name="butyl"
     * @generated
     * @ordered
     */
    public static final int BUTYL_VALUE = 1;

    /**
     * The '<em><b>Ethylene Propylene Rubber</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ethylene Propylene Rubber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ETHYLENE_PROPYLENE_RUBBER
     * @model name="ethylenePropyleneRubber"
     * @generated
     * @ordered
     */
    public static final int ETHYLENE_PROPYLENE_RUBBER_VALUE = 2;

    /**
     * The '<em><b>High Molecular Weight Polyethylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Molecular Weight Polyethylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_MOLECULAR_WEIGHT_POLYETHYLENE
     * @model name="highMolecularWeightPolyethylene"
     * @generated
     * @ordered
     */
    public static final int HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE = 3;

    /**
     * The '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tree Resistant High Molecular Weight Polyethylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE
     * @model name="treeResistantHighMolecularWeightPolyethylene"
     * @generated
     * @ordered
     */
    public static final int TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE = 4;

    /**
     * The '<em><b>Low Capacitance Rubber</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Low Capacitance Rubber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOW_CAPACITANCE_RUBBER
     * @model name="lowCapacitanceRubber"
     * @generated
     * @ordered
     */
    public static final int LOW_CAPACITANCE_RUBBER_VALUE = 5;

    /**
     * The '<em><b>Oil Paper</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oil Paper</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OIL_PAPER
     * @model name="oilPaper"
     * @generated
     * @ordered
     */
    public static final int OIL_PAPER_VALUE = 6;

    /**
     * The '<em><b>Ozone Resistant Rubber</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Ozone Resistant Rubber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OZONE_RESISTANT_RUBBER
     * @model name="ozoneResistantRubber"
     * @generated
     * @ordered
     */
    public static final int OZONE_RESISTANT_RUBBER_VALUE = 7;

    /**
     * The '<em><b>Belted Pilc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Belted Pilc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BELTED_PILC
     * @model name="beltedPilc"
     * @generated
     * @ordered
     */
    public static final int BELTED_PILC_VALUE = 8;

    /**
     * The '<em><b>Unbelted Pilc</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unbelted Pilc</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNBELTED_PILC
     * @model name="unbeltedPilc"
     * @generated
     * @ordered
     */
    public static final int UNBELTED_PILC_VALUE = 9;

    /**
     * The '<em><b>Rubber</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Rubber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RUBBER
     * @model name="rubber"
     * @generated
     * @ordered
     */
    public static final int RUBBER_VALUE = 10;

    /**
     * The '<em><b>Silicon Rubber</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Silicon Rubber</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SILICON_RUBBER
     * @model name="siliconRubber"
     * @generated
     * @ordered
     */
    public static final int SILICON_RUBBER_VALUE = 11;

    /**
     * The '<em><b>Varnished Cambric Cloth</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Varnished Cambric Cloth</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARNISHED_CAMBRIC_CLOTH
     * @model name="varnishedCambricCloth"
     * @generated
     * @ordered
     */
    public static final int VARNISHED_CAMBRIC_CLOTH_VALUE = 12;

    /**
     * The '<em><b>Varnished Dacron Glass</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Varnished Dacron Glass</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VARNISHED_DACRON_GLASS
     * @model name="varnishedDacronGlass"
     * @generated
     * @ordered
     */
    public static final int VARNISHED_DACRON_GLASS_VALUE = 13;

    /**
     * The '<em><b>Crosslinked Polyethylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Crosslinked Polyethylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CROSSLINKED_POLYETHYLENE
     * @model name="crosslinkedPolyethylene"
     * @generated
     * @ordered
     */
    public static final int CROSSLINKED_POLYETHYLENE_VALUE = 14;

    /**
     * The '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Tree Retardant Crosslinked Polyethylene</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TREE_RETARDANT_CROSSLINKED_POLYETHYLENE
     * @model name="treeRetardantCrosslinkedPolyethylene"
     * @generated
     * @ordered
     */
    public static final int TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE = 15;

    /**
     * The '<em><b>High Pressure Fluid Filled</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>High Pressure Fluid Filled</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HIGH_PRESSURE_FLUID_FILLED
     * @model name="highPressureFluidFilled"
     * @generated
     * @ordered
     */
    public static final int HIGH_PRESSURE_FLUID_FILLED_VALUE = 16;

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
    public static final int OTHER_VALUE = 17;

    /**
     * An array of all the '<em><b>Wire Insulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final WireInsulationKind[] VALUES_ARRAY = new WireInsulationKind[] { ASBESTOS_AND_VARNISHED_CAMBRIC,
            BUTYL, ETHYLENE_PROPYLENE_RUBBER, HIGH_MOLECULAR_WEIGHT_POLYETHYLENE,
            TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE, LOW_CAPACITANCE_RUBBER, OIL_PAPER,
            OZONE_RESISTANT_RUBBER, BELTED_PILC, UNBELTED_PILC, RUBBER, SILICON_RUBBER, VARNISHED_CAMBRIC_CLOTH,
            VARNISHED_DACRON_GLASS, CROSSLINKED_POLYETHYLENE, TREE_RETARDANT_CROSSLINKED_POLYETHYLENE,
            HIGH_PRESSURE_FLUID_FILLED, OTHER, };

    /**
     * A public read-only list of all the '<em><b>Wire Insulation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< WireInsulationKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Wire Insulation Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireInsulationKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WireInsulationKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wire Insulation Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireInsulationKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            WireInsulationKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Wire Insulation Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static WireInsulationKind get( int value ) {
        switch( value ) {
        case ASBESTOS_AND_VARNISHED_CAMBRIC_VALUE:
            return ASBESTOS_AND_VARNISHED_CAMBRIC;
        case BUTYL_VALUE:
            return BUTYL;
        case ETHYLENE_PROPYLENE_RUBBER_VALUE:
            return ETHYLENE_PROPYLENE_RUBBER;
        case HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE:
            return HIGH_MOLECULAR_WEIGHT_POLYETHYLENE;
        case TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE_VALUE:
            return TREE_RESISTANT_HIGH_MOLECULAR_WEIGHT_POLYETHYLENE;
        case LOW_CAPACITANCE_RUBBER_VALUE:
            return LOW_CAPACITANCE_RUBBER;
        case OIL_PAPER_VALUE:
            return OIL_PAPER;
        case OZONE_RESISTANT_RUBBER_VALUE:
            return OZONE_RESISTANT_RUBBER;
        case BELTED_PILC_VALUE:
            return BELTED_PILC;
        case UNBELTED_PILC_VALUE:
            return UNBELTED_PILC;
        case RUBBER_VALUE:
            return RUBBER;
        case SILICON_RUBBER_VALUE:
            return SILICON_RUBBER;
        case VARNISHED_CAMBRIC_CLOTH_VALUE:
            return VARNISHED_CAMBRIC_CLOTH;
        case VARNISHED_DACRON_GLASS_VALUE:
            return VARNISHED_DACRON_GLASS;
        case CROSSLINKED_POLYETHYLENE_VALUE:
            return CROSSLINKED_POLYETHYLENE;
        case TREE_RETARDANT_CROSSLINKED_POLYETHYLENE_VALUE:
            return TREE_RETARDANT_CROSSLINKED_POLYETHYLENE;
        case HIGH_PRESSURE_FLUID_FILLED_VALUE:
            return HIGH_PRESSURE_FLUID_FILLED;
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
    private WireInsulationKind( int value, String name, String literal ) {
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

} //WireInsulationKind
