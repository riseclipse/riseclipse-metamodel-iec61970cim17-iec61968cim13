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
 * A representation of the literals of the enumeration '<em><b>Oil Analysis Fluid Analog Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOilAnalysisFluidAnalogKind()
 * @model
 * @generated
 */
public enum OilAnalysisFluidAnalogKind implements Enumerator {
    /**
     * The '<em><b>Acid Number</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ACID_NUMBER_VALUE
     * @generated
     * @ordered
     */
    ACID_NUMBER( 0, "acidNumber", "acidNumber" ),

    /**
     * The '<em><b>Interfacial Tension</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERFACIAL_TENSION_VALUE
     * @generated
     * @ordered
     */
    INTERFACIAL_TENSION( 1, "interfacialTension", "interfacialTension" ),

    /**
     * The '<em><b>Dielectric Breakdown</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DIELECTRIC_BREAKDOWN_VALUE
     * @generated
     * @ordered
     */
    DIELECTRIC_BREAKDOWN( 2, "dielectricBreakdown", "dielectricBreakdown" ),

    /**
     * The '<em><b>Power Factor Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_PERCENT_VALUE
     * @generated
     * @ordered
     */
    POWER_FACTOR_PERCENT( 3, "powerFactorPercent", "powerFactorPercent" ),

    /**
     * The '<em><b>Dissipation Factor</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISSIPATION_FACTOR_VALUE
     * @generated
     * @ordered
     */
    DISSIPATION_FACTOR( 4, "dissipationFactor", "dissipationFactor" ),

    /**
     * The '<em><b>Dissipation Factor Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DISSIPATION_FACTOR_PERCENT_VALUE
     * @generated
     * @ordered
     */
    DISSIPATION_FACTOR_PERCENT( 5, "dissipationFactorPercent", "dissipationFactorPercent" ),

    /**
     * The '<em><b>Oxidation Inhibitor DBP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_DBP_VALUE
     * @generated
     * @ordered
     */
    OXIDATION_INHIBITOR_DBP( 6, "oxidationInhibitorDBP", "oxidationInhibitorDBP" ),

    /**
     * The '<em><b>Oxidation Inhibitor DBPC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_DBPC_VALUE
     * @generated
     * @ordered
     */
    OXIDATION_INHIBITOR_DBPC( 7, "oxidationInhibitorDBPC", "oxidationInhibitorDBPC" ),

    /**
     * The '<em><b>Oxidation Inhibitor D2668</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_D2668_VALUE
     * @generated
     * @ordered
     */
    OXIDATION_INHIBITOR_D2668( 8, "oxidationInhibitorD2668", "oxidationInhibitorD2668" ),

    /**
     * The '<em><b>Additive DBDS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ADDITIVE_DBDS_VALUE
     * @generated
     * @ordered
     */
    ADDITIVE_DBDS( 9, "additiveDBDS", "additiveDBDS" ),

    /**
     * The '<em><b>Specific Gravity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SPECIFIC_GRAVITY_VALUE
     * @generated
     * @ordered
     */
    SPECIFIC_GRAVITY( 10, "specificGravity", "specificGravity" ),

    /**
     * The '<em><b>Density</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DENSITY_VALUE
     * @generated
     * @ordered
     */
    DENSITY( 11, "density", "density" ),

    /**
     * The '<em><b>Fire Point</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIRE_POINT_VALUE
     * @generated
     * @ordered
     */
    FIRE_POINT( 12, "firePoint", "firePoint" ),

    /**
     * The '<em><b>Flash Point Open Cup</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLASH_POINT_OPEN_CUP_VALUE
     * @generated
     * @ordered
     */
    FLASH_POINT_OPEN_CUP( 13, "flashPointOpenCup", "flashPointOpenCup" ),

    /**
     * The '<em><b>Flash Point Closed Cup</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLASH_POINT_CLOSED_CUP_VALUE
     * @generated
     * @ordered
     */
    FLASH_POINT_CLOSED_CUP( 14, "flashPointClosedCup", "flashPointClosedCup" ),

    /**
     * The '<em><b>Pour Point</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POUR_POINT_VALUE
     * @generated
     * @ordered
     */
    POUR_POINT( 15, "pourPoint", "pourPoint" ),

    /**
     * The '<em><b>Pour Point Automatic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #POUR_POINT_AUTOMATIC_VALUE
     * @generated
     * @ordered
     */
    POUR_POINT_AUTOMATIC( 16, "pourPointAutomatic", "pourPointAutomatic" ),

    /**
     * The '<em><b>Kinematic Viscosity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KINEMATIC_VISCOSITY_VALUE
     * @generated
     * @ordered
     */
    KINEMATIC_VISCOSITY( 17, "kinematicViscosity", "kinematicViscosity" ),

    /**
     * The '<em><b>Static Electrification</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STATIC_ELECTRIFICATION_VALUE
     * @generated
     * @ordered
     */
    STATIC_ELECTRIFICATION( 18, "staticElectrification", "staticElectrification" ),

    /**
     * The '<em><b>Resistivity</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESISTIVITY_VALUE
     * @generated
     * @ordered
     */
    RESISTIVITY( 19, "resistivity", "resistivity" ),

    /**
     * The '<em><b>Passivator Content</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_CONTENT_VALUE
     * @generated
     * @ordered
     */
    PASSIVATOR_CONTENT( 20, "passivatorContent", "passivatorContent" ),

    /**
     * The '<em><b>Passivator Irgamet39</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_IRGAMET39_VALUE
     * @generated
     * @ordered
     */
    PASSIVATOR_IRGAMET39( 21, "passivatorIrgamet39", "passivatorIrgamet39" ),

    /**
     * The '<em><b>Passivator TTA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_TTA_VALUE
     * @generated
     * @ordered
     */
    PASSIVATOR_TTA( 22, "passivatorTTA", "passivatorTTA" ),

    /**
     * The '<em><b>Passivator BTA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_BTA_VALUE
     * @generated
     * @ordered
     */
    PASSIVATOR_BTA( 23, "passivatorBTA", "passivatorBTA" ),

    /**
     * The '<em><b>Sediment And Sludge Percent</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEDIMENT_AND_SLUDGE_PERCENT_VALUE
     * @generated
     * @ordered
     */
    SEDIMENT_AND_SLUDGE_PERCENT( 24, "sedimentAndSludgePercent", "sedimentAndSludgePercent" ),

    /**
     * The '<em><b>Carbonyl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CARBONYL_VALUE
     * @generated
     * @ordered
     */
    CARBONYL( 25, "carbonyl", "carbonyl" ),

    /**
     * The '<em><b>Aromatics</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AROMATICS_VALUE
     * @generated
     * @ordered
     */
    AROMATICS( 26, "aromatics", "aromatics" ),

    /**
     * The '<em><b>Oxidation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OXIDATION_VALUE
     * @generated
     * @ordered
     */
    OXIDATION( 27, "oxidation", "oxidation" ),

    /**
     * The '<em><b>Sludge</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SLUDGE_VALUE
     * @generated
     * @ordered
     */
    SLUDGE( 28, "sludge", "sludge" ),

    /**
     * The '<em><b>Soluble Acids</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOLUBLE_ACIDS_VALUE
     * @generated
     * @ordered
     */
    SOLUBLE_ACIDS( 29, "solubleAcids", "solubleAcids" ),

    /**
     * The '<em><b>Volatile Acids</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VOLATILE_ACIDS_VALUE
     * @generated
     * @ordered
     */
    VOLATILE_ACIDS( 30, "volatileAcids", "volatileAcids" ),

    /**
     * The '<em><b>Total Acids</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TOTAL_ACIDS_VALUE
     * @generated
     * @ordered
     */
    TOTAL_ACIDS( 31, "totalAcids", "totalAcids" ),

    /**
     * The '<em><b>Induction Time</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INDUCTION_TIME_VALUE
     * @generated
     * @ordered
     */
    INDUCTION_TIME( 32, "inductionTime", "inductionTime" ),

    /**
     * The '<em><b>Inhibitor61125 Method C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INHIBITOR61125_METHOD_C_VALUE
     * @generated
     * @ordered
     */
    INHIBITOR61125_METHOD_C( 33, "inhibitor61125MethodC", "inhibitor61125MethodC" ),

    /**
     * The '<em><b>Duration61125 Method C</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DURATION61125_METHOD_C_VALUE
     * @generated
     * @ordered
     */
    DURATION61125_METHOD_C( 34, "duration61125MethodC", "duration61125MethodC" ),

    /**
     * The '<em><b>Petroleum Origin</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PETROLEUM_ORIGIN_VALUE
     * @generated
     * @ordered
     */
    PETROLEUM_ORIGIN( 35, "petroleumOrigin", "petroleumOrigin" );

    /**
     * The '<em><b>Acid Number</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Acid Number</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ACID_NUMBER
     * @model name="acidNumber"
     * @generated
     * @ordered
     */
    public static final int ACID_NUMBER_VALUE = 0;

    /**
     * The '<em><b>Interfacial Tension</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interfacial Tension</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERFACIAL_TENSION
     * @model name="interfacialTension"
     * @generated
     * @ordered
     */
    public static final int INTERFACIAL_TENSION_VALUE = 1;

    /**
     * The '<em><b>Dielectric Breakdown</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dielectric Breakdown</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DIELECTRIC_BREAKDOWN
     * @model name="dielectricBreakdown"
     * @generated
     * @ordered
     */
    public static final int DIELECTRIC_BREAKDOWN_VALUE = 2;

    /**
     * The '<em><b>Power Factor Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Power Factor Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POWER_FACTOR_PERCENT
     * @model name="powerFactorPercent"
     * @generated
     * @ordered
     */
    public static final int POWER_FACTOR_PERCENT_VALUE = 3;

    /**
     * The '<em><b>Dissipation Factor</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dissipation Factor</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISSIPATION_FACTOR
     * @model name="dissipationFactor"
     * @generated
     * @ordered
     */
    public static final int DISSIPATION_FACTOR_VALUE = 4;

    /**
     * The '<em><b>Dissipation Factor Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dissipation Factor Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DISSIPATION_FACTOR_PERCENT
     * @model name="dissipationFactorPercent"
     * @generated
     * @ordered
     */
    public static final int DISSIPATION_FACTOR_PERCENT_VALUE = 5;

    /**
     * The '<em><b>Oxidation Inhibitor DBP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oxidation Inhibitor DBP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_DBP
     * @model name="oxidationInhibitorDBP"
     * @generated
     * @ordered
     */
    public static final int OXIDATION_INHIBITOR_DBP_VALUE = 6;

    /**
     * The '<em><b>Oxidation Inhibitor DBPC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oxidation Inhibitor DBPC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_DBPC
     * @model name="oxidationInhibitorDBPC"
     * @generated
     * @ordered
     */
    public static final int OXIDATION_INHIBITOR_DBPC_VALUE = 7;

    /**
     * The '<em><b>Oxidation Inhibitor D2668</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oxidation Inhibitor D2668</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OXIDATION_INHIBITOR_D2668
     * @model name="oxidationInhibitorD2668"
     * @generated
     * @ordered
     */
    public static final int OXIDATION_INHIBITOR_D2668_VALUE = 8;

    /**
     * The '<em><b>Additive DBDS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Additive DBDS</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ADDITIVE_DBDS
     * @model name="additiveDBDS"
     * @generated
     * @ordered
     */
    public static final int ADDITIVE_DBDS_VALUE = 9;

    /**
     * The '<em><b>Specific Gravity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Specific Gravity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SPECIFIC_GRAVITY
     * @model name="specificGravity"
     * @generated
     * @ordered
     */
    public static final int SPECIFIC_GRAVITY_VALUE = 10;

    /**
     * The '<em><b>Density</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Density</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DENSITY
     * @model name="density"
     * @generated
     * @ordered
     */
    public static final int DENSITY_VALUE = 11;

    /**
     * The '<em><b>Fire Point</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fire Point</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIRE_POINT
     * @model name="firePoint"
     * @generated
     * @ordered
     */
    public static final int FIRE_POINT_VALUE = 12;

    /**
     * The '<em><b>Flash Point Open Cup</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Flash Point Open Cup</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FLASH_POINT_OPEN_CUP
     * @model name="flashPointOpenCup"
     * @generated
     * @ordered
     */
    public static final int FLASH_POINT_OPEN_CUP_VALUE = 13;

    /**
     * The '<em><b>Flash Point Closed Cup</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Flash Point Closed Cup</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FLASH_POINT_CLOSED_CUP
     * @model name="flashPointClosedCup"
     * @generated
     * @ordered
     */
    public static final int FLASH_POINT_CLOSED_CUP_VALUE = 14;

    /**
     * The '<em><b>Pour Point</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pour Point</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POUR_POINT
     * @model name="pourPoint"
     * @generated
     * @ordered
     */
    public static final int POUR_POINT_VALUE = 15;

    /**
     * The '<em><b>Pour Point Automatic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pour Point Automatic</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #POUR_POINT_AUTOMATIC
     * @model name="pourPointAutomatic"
     * @generated
     * @ordered
     */
    public static final int POUR_POINT_AUTOMATIC_VALUE = 16;

    /**
     * The '<em><b>Kinematic Viscosity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Kinematic Viscosity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KINEMATIC_VISCOSITY
     * @model name="kinematicViscosity"
     * @generated
     * @ordered
     */
    public static final int KINEMATIC_VISCOSITY_VALUE = 17;

    /**
     * The '<em><b>Static Electrification</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Static Electrification</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STATIC_ELECTRIFICATION
     * @model name="staticElectrification"
     * @generated
     * @ordered
     */
    public static final int STATIC_ELECTRIFICATION_VALUE = 18;

    /**
     * The '<em><b>Resistivity</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Resistivity</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #RESISTIVITY
     * @model name="resistivity"
     * @generated
     * @ordered
     */
    public static final int RESISTIVITY_VALUE = 19;

    /**
     * The '<em><b>Passivator Content</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Passivator Content</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_CONTENT
     * @model name="passivatorContent"
     * @generated
     * @ordered
     */
    public static final int PASSIVATOR_CONTENT_VALUE = 20;

    /**
     * The '<em><b>Passivator Irgamet39</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Passivator Irgamet39</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_IRGAMET39
     * @model name="passivatorIrgamet39"
     * @generated
     * @ordered
     */
    public static final int PASSIVATOR_IRGAMET39_VALUE = 21;

    /**
     * The '<em><b>Passivator TTA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Passivator TTA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_TTA
     * @model name="passivatorTTA"
     * @generated
     * @ordered
     */
    public static final int PASSIVATOR_TTA_VALUE = 22;

    /**
     * The '<em><b>Passivator BTA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Passivator BTA</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PASSIVATOR_BTA
     * @model name="passivatorBTA"
     * @generated
     * @ordered
     */
    public static final int PASSIVATOR_BTA_VALUE = 23;

    /**
     * The '<em><b>Sediment And Sludge Percent</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sediment And Sludge Percent</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEDIMENT_AND_SLUDGE_PERCENT
     * @model name="sedimentAndSludgePercent"
     * @generated
     * @ordered
     */
    public static final int SEDIMENT_AND_SLUDGE_PERCENT_VALUE = 24;

    /**
     * The '<em><b>Carbonyl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Carbonyl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CARBONYL
     * @model name="carbonyl"
     * @generated
     * @ordered
     */
    public static final int CARBONYL_VALUE = 25;

    /**
     * The '<em><b>Aromatics</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Aromatics</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #AROMATICS
     * @model name="aromatics"
     * @generated
     * @ordered
     */
    public static final int AROMATICS_VALUE = 26;

    /**
     * The '<em><b>Oxidation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Oxidation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #OXIDATION
     * @model name="oxidation"
     * @generated
     * @ordered
     */
    public static final int OXIDATION_VALUE = 27;

    /**
     * The '<em><b>Sludge</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sludge</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SLUDGE
     * @model name="sludge"
     * @generated
     * @ordered
     */
    public static final int SLUDGE_VALUE = 28;

    /**
     * The '<em><b>Soluble Acids</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Soluble Acids</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOLUBLE_ACIDS
     * @model name="solubleAcids"
     * @generated
     * @ordered
     */
    public static final int SOLUBLE_ACIDS_VALUE = 29;

    /**
     * The '<em><b>Volatile Acids</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Volatile Acids</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VOLATILE_ACIDS
     * @model name="volatileAcids"
     * @generated
     * @ordered
     */
    public static final int VOLATILE_ACIDS_VALUE = 30;

    /**
     * The '<em><b>Total Acids</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Total Acids</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TOTAL_ACIDS
     * @model name="totalAcids"
     * @generated
     * @ordered
     */
    public static final int TOTAL_ACIDS_VALUE = 31;

    /**
     * The '<em><b>Induction Time</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Induction Time</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INDUCTION_TIME
     * @model name="inductionTime"
     * @generated
     * @ordered
     */
    public static final int INDUCTION_TIME_VALUE = 32;

    /**
     * The '<em><b>Inhibitor61125 Method C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Inhibitor61125 Method C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INHIBITOR61125_METHOD_C
     * @model name="inhibitor61125MethodC"
     * @generated
     * @ordered
     */
    public static final int INHIBITOR61125_METHOD_C_VALUE = 33;

    /**
     * The '<em><b>Duration61125 Method C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Duration61125 Method C</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DURATION61125_METHOD_C
     * @model name="duration61125MethodC"
     * @generated
     * @ordered
     */
    public static final int DURATION61125_METHOD_C_VALUE = 34;

    /**
     * The '<em><b>Petroleum Origin</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Petroleum Origin</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PETROLEUM_ORIGIN
     * @model name="petroleumOrigin"
     * @generated
     * @ordered
     */
    public static final int PETROLEUM_ORIGIN_VALUE = 35;

    /**
     * An array of all the '<em><b>Oil Analysis Fluid Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final OilAnalysisFluidAnalogKind[] VALUES_ARRAY = new OilAnalysisFluidAnalogKind[] { ACID_NUMBER,
            INTERFACIAL_TENSION, DIELECTRIC_BREAKDOWN, POWER_FACTOR_PERCENT, DISSIPATION_FACTOR,
            DISSIPATION_FACTOR_PERCENT, OXIDATION_INHIBITOR_DBP, OXIDATION_INHIBITOR_DBPC, OXIDATION_INHIBITOR_D2668,
            ADDITIVE_DBDS, SPECIFIC_GRAVITY, DENSITY, FIRE_POINT, FLASH_POINT_OPEN_CUP, FLASH_POINT_CLOSED_CUP,
            POUR_POINT, POUR_POINT_AUTOMATIC, KINEMATIC_VISCOSITY, STATIC_ELECTRIFICATION, RESISTIVITY,
            PASSIVATOR_CONTENT, PASSIVATOR_IRGAMET39, PASSIVATOR_TTA, PASSIVATOR_BTA, SEDIMENT_AND_SLUDGE_PERCENT,
            CARBONYL, AROMATICS, OXIDATION, SLUDGE, SOLUBLE_ACIDS, VOLATILE_ACIDS, TOTAL_ACIDS, INDUCTION_TIME,
            INHIBITOR61125_METHOD_C, DURATION61125_METHOD_C, PETROLEUM_ORIGIN, };

    /**
     * A public read-only list of all the '<em><b>Oil Analysis Fluid Analog Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< OilAnalysisFluidAnalogKind > VALUES = Collections
            .unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Oil Analysis Fluid Analog Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidAnalogKind get( String literal ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisFluidAnalogKind result = VALUES_ARRAY[i];
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Fluid Analog Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidAnalogKind getByName( String name ) {
        for( int i = 0; i < VALUES_ARRAY.length; ++i ) {
            OilAnalysisFluidAnalogKind result = VALUES_ARRAY[i];
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Oil Analysis Fluid Analog Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static OilAnalysisFluidAnalogKind get( int value ) {
        switch( value ) {
        case ACID_NUMBER_VALUE:
            return ACID_NUMBER;
        case INTERFACIAL_TENSION_VALUE:
            return INTERFACIAL_TENSION;
        case DIELECTRIC_BREAKDOWN_VALUE:
            return DIELECTRIC_BREAKDOWN;
        case POWER_FACTOR_PERCENT_VALUE:
            return POWER_FACTOR_PERCENT;
        case DISSIPATION_FACTOR_VALUE:
            return DISSIPATION_FACTOR;
        case DISSIPATION_FACTOR_PERCENT_VALUE:
            return DISSIPATION_FACTOR_PERCENT;
        case OXIDATION_INHIBITOR_DBP_VALUE:
            return OXIDATION_INHIBITOR_DBP;
        case OXIDATION_INHIBITOR_DBPC_VALUE:
            return OXIDATION_INHIBITOR_DBPC;
        case OXIDATION_INHIBITOR_D2668_VALUE:
            return OXIDATION_INHIBITOR_D2668;
        case ADDITIVE_DBDS_VALUE:
            return ADDITIVE_DBDS;
        case SPECIFIC_GRAVITY_VALUE:
            return SPECIFIC_GRAVITY;
        case DENSITY_VALUE:
            return DENSITY;
        case FIRE_POINT_VALUE:
            return FIRE_POINT;
        case FLASH_POINT_OPEN_CUP_VALUE:
            return FLASH_POINT_OPEN_CUP;
        case FLASH_POINT_CLOSED_CUP_VALUE:
            return FLASH_POINT_CLOSED_CUP;
        case POUR_POINT_VALUE:
            return POUR_POINT;
        case POUR_POINT_AUTOMATIC_VALUE:
            return POUR_POINT_AUTOMATIC;
        case KINEMATIC_VISCOSITY_VALUE:
            return KINEMATIC_VISCOSITY;
        case STATIC_ELECTRIFICATION_VALUE:
            return STATIC_ELECTRIFICATION;
        case RESISTIVITY_VALUE:
            return RESISTIVITY;
        case PASSIVATOR_CONTENT_VALUE:
            return PASSIVATOR_CONTENT;
        case PASSIVATOR_IRGAMET39_VALUE:
            return PASSIVATOR_IRGAMET39;
        case PASSIVATOR_TTA_VALUE:
            return PASSIVATOR_TTA;
        case PASSIVATOR_BTA_VALUE:
            return PASSIVATOR_BTA;
        case SEDIMENT_AND_SLUDGE_PERCENT_VALUE:
            return SEDIMENT_AND_SLUDGE_PERCENT;
        case CARBONYL_VALUE:
            return CARBONYL;
        case AROMATICS_VALUE:
            return AROMATICS;
        case OXIDATION_VALUE:
            return OXIDATION;
        case SLUDGE_VALUE:
            return SLUDGE;
        case SOLUBLE_ACIDS_VALUE:
            return SOLUBLE_ACIDS;
        case VOLATILE_ACIDS_VALUE:
            return VOLATILE_ACIDS;
        case TOTAL_ACIDS_VALUE:
            return TOTAL_ACIDS;
        case INDUCTION_TIME_VALUE:
            return INDUCTION_TIME;
        case INHIBITOR61125_METHOD_C_VALUE:
            return INHIBITOR61125_METHOD_C;
        case DURATION61125_METHOD_C_VALUE:
            return DURATION61125_METHOD_C;
        case PETROLEUM_ORIGIN_VALUE:
            return PETROLEUM_ORIGIN;
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
    private OilAnalysisFluidAnalogKind( int value, String name, String literal ) {
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

} //OilAnalysisFluidAnalogKind
