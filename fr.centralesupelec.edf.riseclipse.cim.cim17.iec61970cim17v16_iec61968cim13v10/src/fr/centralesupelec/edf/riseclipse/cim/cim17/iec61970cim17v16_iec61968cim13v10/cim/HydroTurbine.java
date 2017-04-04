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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hydro Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRating <em>Speed Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine()
 * @model
 * @generated
 */
public interface HydroTurbine extends PrimeMover {
    /**
     * Returns the value of the '<em><b>Gate Rate Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gate Rate Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gate Rate Limit</em>' attribute.
     * @see #isSetGateRateLimit()
     * @see #unsetGateRateLimit()
     * @see #setGateRateLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_GateRateLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.gateRateLimit' kind='element'"
     * @generated
     */
    Float getGateRateLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gate Rate Limit</em>' attribute.
     * @see #isSetGateRateLimit()
     * @see #unsetGateRateLimit()
     * @see #getGateRateLimit()
     * @generated
     */
    void setGateRateLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGateRateLimit()
     * @see #getGateRateLimit()
     * @see #setGateRateLimit(Float)
     * @generated
     */
    void unsetGateRateLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateRateLimit <em>Gate Rate Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gate Rate Limit</em>' attribute is set.
     * @see #unsetGateRateLimit()
     * @see #getGateRateLimit()
     * @see #setGateRateLimit(Float)
     * @generated
     */
    boolean isSetGateRateLimit();

    /**
     * Returns the value of the '<em><b>Gate Upper Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gate Upper Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gate Upper Limit</em>' attribute.
     * @see #isSetGateUpperLimit()
     * @see #unsetGateUpperLimit()
     * @see #setGateUpperLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_GateUpperLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.gateUpperLimit' kind='element'"
     * @generated
     */
    Float getGateUpperLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gate Upper Limit</em>' attribute.
     * @see #isSetGateUpperLimit()
     * @see #unsetGateUpperLimit()
     * @see #getGateUpperLimit()
     * @generated
     */
    void setGateUpperLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGateUpperLimit()
     * @see #getGateUpperLimit()
     * @see #setGateUpperLimit(Float)
     * @generated
     */
    void unsetGateUpperLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getGateUpperLimit <em>Gate Upper Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gate Upper Limit</em>' attribute is set.
     * @see #unsetGateUpperLimit()
     * @see #getGateUpperLimit()
     * @see #setGateUpperLimit(Float)
     * @generated
     */
    boolean isSetGateUpperLimit();

    /**
     * Returns the value of the '<em><b>Max Head Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Head Max P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Head Max P</em>' attribute.
     * @see #isSetMaxHeadMaxP()
     * @see #unsetMaxHeadMaxP()
     * @see #setMaxHeadMaxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_MaxHeadMaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.maxHeadMaxP' kind='element'"
     * @generated
     */
    Float getMaxHeadMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Head Max P</em>' attribute.
     * @see #isSetMaxHeadMaxP()
     * @see #unsetMaxHeadMaxP()
     * @see #getMaxHeadMaxP()
     * @generated
     */
    void setMaxHeadMaxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxHeadMaxP()
     * @see #getMaxHeadMaxP()
     * @see #setMaxHeadMaxP(Float)
     * @generated
     */
    void unsetMaxHeadMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMaxHeadMaxP <em>Max Head Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Head Max P</em>' attribute is set.
     * @see #unsetMaxHeadMaxP()
     * @see #getMaxHeadMaxP()
     * @see #setMaxHeadMaxP(Float)
     * @generated
     */
    boolean isSetMaxHeadMaxP();

    /**
     * Returns the value of the '<em><b>Min Head Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Head Max P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Head Max P</em>' attribute.
     * @see #isSetMinHeadMaxP()
     * @see #unsetMinHeadMaxP()
     * @see #setMinHeadMaxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_MinHeadMaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.minHeadMaxP' kind='element'"
     * @generated
     */
    Float getMinHeadMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Head Max P</em>' attribute.
     * @see #isSetMinHeadMaxP()
     * @see #unsetMinHeadMaxP()
     * @see #getMinHeadMaxP()
     * @generated
     */
    void setMinHeadMaxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinHeadMaxP()
     * @see #getMinHeadMaxP()
     * @see #setMinHeadMaxP(Float)
     * @generated
     */
    void unsetMinHeadMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getMinHeadMaxP <em>Min Head Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Head Max P</em>' attribute is set.
     * @see #unsetMinHeadMaxP()
     * @see #getMinHeadMaxP()
     * @see #setMinHeadMaxP(Float)
     * @generated
     */
    boolean isSetMinHeadMaxP();

    /**
     * Returns the value of the '<em><b>Speed Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Speed Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speed Rating</em>' attribute.
     * @see #isSetSpeedRating()
     * @see #unsetSpeedRating()
     * @see #setSpeedRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_SpeedRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.speedRating' kind='element'"
     * @generated
     */
    Float getSpeedRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speed Rating</em>' attribute.
     * @see #isSetSpeedRating()
     * @see #unsetSpeedRating()
     * @see #getSpeedRating()
     * @generated
     */
    void setSpeedRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpeedRating()
     * @see #getSpeedRating()
     * @see #setSpeedRating(Float)
     * @generated
     */
    void unsetSpeedRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRating <em>Speed Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Speed Rating</em>' attribute is set.
     * @see #unsetSpeedRating()
     * @see #getSpeedRating()
     * @see #setSpeedRating(Float)
     * @generated
     */
    boolean isSetSpeedRating();

    /**
     * Returns the value of the '<em><b>Speed Regulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Speed Regulation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Speed Regulation</em>' attribute.
     * @see #isSetSpeedRegulation()
     * @see #unsetSpeedRegulation()
     * @see #setSpeedRegulation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_SpeedRegulation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.speedRegulation' kind='element'"
     * @generated
     */
    Float getSpeedRegulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speed Regulation</em>' attribute.
     * @see #isSetSpeedRegulation()
     * @see #unsetSpeedRegulation()
     * @see #getSpeedRegulation()
     * @generated
     */
    void setSpeedRegulation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpeedRegulation()
     * @see #getSpeedRegulation()
     * @see #setSpeedRegulation(Float)
     * @generated
     */
    void unsetSpeedRegulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getSpeedRegulation <em>Speed Regulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Speed Regulation</em>' attribute is set.
     * @see #unsetSpeedRegulation()
     * @see #getSpeedRegulation()
     * @see #setSpeedRegulation(Float)
     * @generated
     */
    boolean isSetSpeedRegulation();

    /**
     * Returns the value of the '<em><b>Transient Droop Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transient Droop Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transient Droop Time</em>' attribute.
     * @see #isSetTransientDroopTime()
     * @see #unsetTransientDroopTime()
     * @see #setTransientDroopTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_TransientDroopTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.transientDroopTime' kind='element'"
     * @generated
     */
    Float getTransientDroopTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient Droop Time</em>' attribute.
     * @see #isSetTransientDroopTime()
     * @see #unsetTransientDroopTime()
     * @see #getTransientDroopTime()
     * @generated
     */
    void setTransientDroopTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransientDroopTime()
     * @see #getTransientDroopTime()
     * @see #setTransientDroopTime(Float)
     * @generated
     */
    void unsetTransientDroopTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientDroopTime <em>Transient Droop Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transient Droop Time</em>' attribute is set.
     * @see #unsetTransientDroopTime()
     * @see #getTransientDroopTime()
     * @see #setTransientDroopTime(Float)
     * @generated
     */
    boolean isSetTransientDroopTime();

    /**
     * Returns the value of the '<em><b>Transient Regulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transient Regulation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transient Regulation</em>' attribute.
     * @see #isSetTransientRegulation()
     * @see #unsetTransientRegulation()
     * @see #setTransientRegulation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_TransientRegulation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.transientRegulation' kind='element'"
     * @generated
     */
    Float getTransientRegulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transient Regulation</em>' attribute.
     * @see #isSetTransientRegulation()
     * @see #unsetTransientRegulation()
     * @see #getTransientRegulation()
     * @generated
     */
    void setTransientRegulation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransientRegulation()
     * @see #getTransientRegulation()
     * @see #setTransientRegulation(Float)
     * @generated
     */
    void unsetTransientRegulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTransientRegulation <em>Transient Regulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transient Regulation</em>' attribute is set.
     * @see #unsetTransientRegulation()
     * @see #getTransientRegulation()
     * @see #setTransientRegulation(Float)
     * @generated
     */
    boolean isSetTransientRegulation();

    /**
     * Returns the value of the '<em><b>Turbine Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Turbine Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Turbine Rating</em>' attribute.
     * @see #isSetTurbineRating()
     * @see #unsetTurbineRating()
     * @see #setTurbineRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_TurbineRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.turbineRating' kind='element'"
     * @generated
     */
    Float getTurbineRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Rating</em>' attribute.
     * @see #isSetTurbineRating()
     * @see #unsetTurbineRating()
     * @see #getTurbineRating()
     * @generated
     */
    void setTurbineRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineRating()
     * @see #getTurbineRating()
     * @see #setTurbineRating(Float)
     * @generated
     */
    void unsetTurbineRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineRating <em>Turbine Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Rating</em>' attribute is set.
     * @see #unsetTurbineRating()
     * @see #getTurbineRating()
     * @see #setTurbineRating(Float)
     * @generated
     */
    boolean isSetTurbineRating();

    /**
     * Returns the value of the '<em><b>Turbine Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Turbine Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Turbine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineType
     * @see #isSetTurbineType()
     * @see #unsetTurbineType()
     * @see #setTurbineType(TurbineType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_TurbineType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.turbineType' kind='element'"
     * @generated
     */
    TurbineType getTurbineType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Turbine Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineType
     * @see #isSetTurbineType()
     * @see #unsetTurbineType()
     * @see #getTurbineType()
     * @generated
     */
    void setTurbineType( TurbineType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTurbineType()
     * @see #getTurbineType()
     * @see #setTurbineType(TurbineType)
     * @generated
     */
    void unsetTurbineType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getTurbineType <em>Turbine Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Turbine Type</em>' attribute is set.
     * @see #unsetTurbineType()
     * @see #getTurbineType()
     * @see #setTurbineType(TurbineType)
     * @generated
     */
    boolean isSetTurbineType();

    /**
     * Returns the value of the '<em><b>Water Starting Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Water Starting Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Water Starting Time</em>' attribute.
     * @see #isSetWaterStartingTime()
     * @see #unsetWaterStartingTime()
     * @see #setWaterStartingTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroTurbine_WaterStartingTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroTurbine.waterStartingTime' kind='element'"
     * @generated
     */
    Float getWaterStartingTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Water Starting Time</em>' attribute.
     * @see #isSetWaterStartingTime()
     * @see #unsetWaterStartingTime()
     * @see #getWaterStartingTime()
     * @generated
     */
    void setWaterStartingTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWaterStartingTime()
     * @see #getWaterStartingTime()
     * @see #setWaterStartingTime(Float)
     * @generated
     */
    void unsetWaterStartingTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine#getWaterStartingTime <em>Water Starting Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Water Starting Time</em>' attribute is set.
     * @see #unsetWaterStartingTime()
     * @see #getWaterStartingTime()
     * @see #setWaterStartingTime(Float)
     * @generated
     */
    boolean isSetWaterStartingTime();

} // HydroTurbine
