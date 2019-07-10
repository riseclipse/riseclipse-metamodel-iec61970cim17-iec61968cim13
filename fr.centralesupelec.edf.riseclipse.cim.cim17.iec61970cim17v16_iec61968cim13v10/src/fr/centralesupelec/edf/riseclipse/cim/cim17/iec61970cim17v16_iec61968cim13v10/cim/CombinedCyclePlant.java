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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Cycle Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombinedCyclePlant()
 * @model
 * @generated
 */
public interface CombinedCyclePlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Comb Cycle Plant Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Comb Cycle Plant Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Comb Cycle Plant Rating</em>' attribute.
     * @see #isSetCombCyclePlantRating()
     * @see #unsetCombCyclePlantRating()
     * @see #setCombCyclePlantRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombinedCyclePlant_CombCyclePlantRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombinedCyclePlant.combCyclePlantRating' kind='element'"
     * @generated
     */
    Float getCombCyclePlantRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Comb Cycle Plant Rating</em>' attribute.
     * @see #isSetCombCyclePlantRating()
     * @see #unsetCombCyclePlantRating()
     * @see #getCombCyclePlantRating()
     * @generated
     */
    void setCombCyclePlantRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombCyclePlantRating()
     * @see #getCombCyclePlantRating()
     * @see #setCombCyclePlantRating(Float)
     * @generated
     */
    void unsetCombCyclePlantRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getCombCyclePlantRating <em>Comb Cycle Plant Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Comb Cycle Plant Rating</em>' attribute is set.
     * @see #unsetCombCyclePlantRating()
     * @see #getCombCyclePlantRating()
     * @see #setCombCyclePlantRating(Float)
     * @generated
     */
    boolean isSetCombCyclePlantRating();

    /**
     * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Units</em>' reference list.
     * @see #isSetThermalGeneratingUnits()
     * @see #unsetThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCombinedCyclePlant_ThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant
     * @model opposite="CombinedCyclePlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CombinedCyclePlant.ThermalGeneratingUnits' kind='element'"
     * @generated
     */
    EList< ThermalGeneratingUnit > getThermalGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    void unsetThermalGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Units</em>' reference list is set.
     * @see #unsetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    boolean isSetThermalGeneratingUnits();

} // CombinedCyclePlant
