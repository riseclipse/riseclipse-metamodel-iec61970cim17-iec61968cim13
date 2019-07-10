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
 * A representation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getRatedP <em>Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant()
 * @model
 * @generated
 */
public interface CogenerationPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Cogen HP Sendout Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogen HP Sendout Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogen HP Sendout Rating</em>' attribute.
     * @see #isSetCogenHPSendoutRating()
     * @see #unsetCogenHPSendoutRating()
     * @see #setCogenHPSendoutRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_CogenHPSendoutRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.cogenHPSendoutRating' kind='element'"
     * @generated
     */
    Float getCogenHPSendoutRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogen HP Sendout Rating</em>' attribute.
     * @see #isSetCogenHPSendoutRating()
     * @see #unsetCogenHPSendoutRating()
     * @see #getCogenHPSendoutRating()
     * @generated
     */
    void setCogenHPSendoutRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenHPSendoutRating()
     * @see #getCogenHPSendoutRating()
     * @see #setCogenHPSendoutRating(Float)
     * @generated
     */
    void unsetCogenHPSendoutRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogen HP Sendout Rating</em>' attribute is set.
     * @see #unsetCogenHPSendoutRating()
     * @see #getCogenHPSendoutRating()
     * @see #setCogenHPSendoutRating(Float)
     * @generated
     */
    boolean isSetCogenHPSendoutRating();

    /**
     * Returns the value of the '<em><b>Cogen HP Steam Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogen HP Steam Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogen HP Steam Rating</em>' attribute.
     * @see #isSetCogenHPSteamRating()
     * @see #unsetCogenHPSteamRating()
     * @see #setCogenHPSteamRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_CogenHPSteamRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.cogenHPSteamRating' kind='element'"
     * @generated
     */
    Float getCogenHPSteamRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogen HP Steam Rating</em>' attribute.
     * @see #isSetCogenHPSteamRating()
     * @see #unsetCogenHPSteamRating()
     * @see #getCogenHPSteamRating()
     * @generated
     */
    void setCogenHPSteamRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenHPSteamRating()
     * @see #getCogenHPSteamRating()
     * @see #setCogenHPSteamRating(Float)
     * @generated
     */
    void unsetCogenHPSteamRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogen HP Steam Rating</em>' attribute is set.
     * @see #unsetCogenHPSteamRating()
     * @see #getCogenHPSteamRating()
     * @see #setCogenHPSteamRating(Float)
     * @generated
     */
    boolean isSetCogenHPSteamRating();

    /**
     * Returns the value of the '<em><b>Cogen LP Sendout Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogen LP Sendout Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogen LP Sendout Rating</em>' attribute.
     * @see #isSetCogenLPSendoutRating()
     * @see #unsetCogenLPSendoutRating()
     * @see #setCogenLPSendoutRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_CogenLPSendoutRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.cogenLPSendoutRating' kind='element'"
     * @generated
     */
    Float getCogenLPSendoutRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogen LP Sendout Rating</em>' attribute.
     * @see #isSetCogenLPSendoutRating()
     * @see #unsetCogenLPSendoutRating()
     * @see #getCogenLPSendoutRating()
     * @generated
     */
    void setCogenLPSendoutRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenLPSendoutRating()
     * @see #getCogenLPSendoutRating()
     * @see #setCogenLPSendoutRating(Float)
     * @generated
     */
    void unsetCogenLPSendoutRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogen LP Sendout Rating</em>' attribute is set.
     * @see #unsetCogenLPSendoutRating()
     * @see #getCogenLPSendoutRating()
     * @see #setCogenLPSendoutRating(Float)
     * @generated
     */
    boolean isSetCogenLPSendoutRating();

    /**
     * Returns the value of the '<em><b>Cogen LP Steam Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogen LP Steam Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogen LP Steam Rating</em>' attribute.
     * @see #isSetCogenLPSteamRating()
     * @see #unsetCogenLPSteamRating()
     * @see #setCogenLPSteamRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_CogenLPSteamRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.cogenLPSteamRating' kind='element'"
     * @generated
     */
    Float getCogenLPSteamRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogen LP Steam Rating</em>' attribute.
     * @see #isSetCogenLPSteamRating()
     * @see #unsetCogenLPSteamRating()
     * @see #getCogenLPSteamRating()
     * @generated
     */
    void setCogenLPSteamRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenLPSteamRating()
     * @see #getCogenLPSteamRating()
     * @see #setCogenLPSteamRating(Float)
     * @generated
     */
    void unsetCogenLPSteamRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogen LP Steam Rating</em>' attribute is set.
     * @see #unsetCogenLPSteamRating()
     * @see #getCogenLPSteamRating()
     * @see #setCogenLPSteamRating(Float)
     * @generated
     */
    boolean isSetCogenLPSteamRating();

    /**
     * Returns the value of the '<em><b>Rated P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated P</em>' attribute.
     * @see #isSetRatedP()
     * @see #unsetRatedP()
     * @see #setRatedP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_RatedP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.ratedP' kind='element'"
     * @generated
     */
    Float getRatedP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated P</em>' attribute.
     * @see #isSetRatedP()
     * @see #unsetRatedP()
     * @see #getRatedP()
     * @generated
     */
    void setRatedP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedP()
     * @see #getRatedP()
     * @see #setRatedP(Float)
     * @generated
     */
    void unsetRatedP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getRatedP <em>Rated P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated P</em>' attribute is set.
     * @see #unsetRatedP()
     * @see #getRatedP()
     * @see #setRatedP(Float)
     * @generated
     */
    boolean isSetRatedP();

    /**
     * Returns the value of the '<em><b>Thermal Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Units</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Units</em>' reference list.
     * @see #isSetThermalGeneratingUnits()
     * @see #unsetThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_ThermalGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant
     * @model opposite="CogenerationPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.ThermalGeneratingUnits' kind='element'"
     * @generated
     */
    EList< ThermalGeneratingUnit > getThermalGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    void unsetThermalGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Units</em>' reference list is set.
     * @see #unsetThermalGeneratingUnits()
     * @see #getThermalGeneratingUnits()
     * @generated
     */
    boolean isSetThermalGeneratingUnits();

    /**
     * Returns the value of the '<em><b>Steam Sendout Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant <em>Cogeneration Plant</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Sendout Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Sendout Schedule</em>' reference.
     * @see #isSetSteamSendoutSchedule()
     * @see #unsetSteamSendoutSchedule()
     * @see #setSteamSendoutSchedule(SteamSendoutSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCogenerationPlant_SteamSendoutSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule#getCogenerationPlant
     * @model opposite="CogenerationPlant" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CogenerationPlant.SteamSendoutSchedule' kind='element'"
     * @generated
     */
    SteamSendoutSchedule getSteamSendoutSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Steam Sendout Schedule</em>' reference.
     * @see #isSetSteamSendoutSchedule()
     * @see #unsetSteamSendoutSchedule()
     * @see #getSteamSendoutSchedule()
     * @generated
     */
    void setSteamSendoutSchedule( SteamSendoutSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamSendoutSchedule()
     * @see #getSteamSendoutSchedule()
     * @see #setSteamSendoutSchedule(SteamSendoutSchedule)
     * @generated
     */
    void unsetSteamSendoutSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Sendout Schedule</em>' reference is set.
     * @see #unsetSteamSendoutSchedule()
     * @see #getSteamSendoutSchedule()
     * @see #setSteamSendoutSchedule(SteamSendoutSchedule)
     * @generated
     */
    boolean isSetSteamSendoutSchedule();

} // CogenerationPlant
