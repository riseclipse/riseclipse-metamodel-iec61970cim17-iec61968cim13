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
 * A representation of the model object '<em><b>Reservoir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getGrossCapacity <em>Gross Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir()
 * @model
 * @generated
 */
public interface Reservoir extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Active Storage Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Active Storage Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Active Storage Capacity</em>' attribute.
     * @see #isSetActiveStorageCapacity()
     * @see #unsetActiveStorageCapacity()
     * @see #setActiveStorageCapacity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_ActiveStorageCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.activeStorageCapacity' kind='element'"
     * @generated
     */
    Float getActiveStorageCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Active Storage Capacity</em>' attribute.
     * @see #isSetActiveStorageCapacity()
     * @see #unsetActiveStorageCapacity()
     * @see #getActiveStorageCapacity()
     * @generated
     */
    void setActiveStorageCapacity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetActiveStorageCapacity()
     * @see #getActiveStorageCapacity()
     * @see #setActiveStorageCapacity(Float)
     * @generated
     */
    void unsetActiveStorageCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getActiveStorageCapacity <em>Active Storage Capacity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Active Storage Capacity</em>' attribute is set.
     * @see #unsetActiveStorageCapacity()
     * @see #getActiveStorageCapacity()
     * @see #setActiveStorageCapacity(Float)
     * @generated
     */
    boolean isSetActiveStorageCapacity();

    /**
     * Returns the value of the '<em><b>Energy Storage Rating</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Storage Rating</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Storage Rating</em>' attribute.
     * @see #isSetEnergyStorageRating()
     * @see #unsetEnergyStorageRating()
     * @see #setEnergyStorageRating(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_EnergyStorageRating()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.energyStorageRating' kind='element'"
     * @generated
     */
    Float getEnergyStorageRating();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Storage Rating</em>' attribute.
     * @see #isSetEnergyStorageRating()
     * @see #unsetEnergyStorageRating()
     * @see #getEnergyStorageRating()
     * @generated
     */
    void setEnergyStorageRating( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyStorageRating()
     * @see #getEnergyStorageRating()
     * @see #setEnergyStorageRating(Float)
     * @generated
     */
    void unsetEnergyStorageRating();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getEnergyStorageRating <em>Energy Storage Rating</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Storage Rating</em>' attribute is set.
     * @see #unsetEnergyStorageRating()
     * @see #getEnergyStorageRating()
     * @see #setEnergyStorageRating(Float)
     * @generated
     */
    boolean isSetEnergyStorageRating();

    /**
     * Returns the value of the '<em><b>Full Supply Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Full Supply Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Full Supply Level</em>' attribute.
     * @see #isSetFullSupplyLevel()
     * @see #unsetFullSupplyLevel()
     * @see #setFullSupplyLevel(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_FullSupplyLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.fullSupplyLevel' kind='element'"
     * @generated
     */
    Float getFullSupplyLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Full Supply Level</em>' attribute.
     * @see #isSetFullSupplyLevel()
     * @see #unsetFullSupplyLevel()
     * @see #getFullSupplyLevel()
     * @generated
     */
    void setFullSupplyLevel( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFullSupplyLevel()
     * @see #getFullSupplyLevel()
     * @see #setFullSupplyLevel(Float)
     * @generated
     */
    void unsetFullSupplyLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getFullSupplyLevel <em>Full Supply Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Full Supply Level</em>' attribute is set.
     * @see #unsetFullSupplyLevel()
     * @see #getFullSupplyLevel()
     * @see #setFullSupplyLevel(Float)
     * @generated
     */
    boolean isSetFullSupplyLevel();

    /**
     * Returns the value of the '<em><b>Gross Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gross Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gross Capacity</em>' attribute.
     * @see #isSetGrossCapacity()
     * @see #unsetGrossCapacity()
     * @see #setGrossCapacity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_GrossCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.grossCapacity' kind='element'"
     * @generated
     */
    Float getGrossCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gross Capacity</em>' attribute.
     * @see #isSetGrossCapacity()
     * @see #unsetGrossCapacity()
     * @see #getGrossCapacity()
     * @generated
     */
    void setGrossCapacity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrossCapacity()
     * @see #getGrossCapacity()
     * @see #setGrossCapacity(Float)
     * @generated
     */
    void unsetGrossCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getGrossCapacity <em>Gross Capacity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gross Capacity</em>' attribute is set.
     * @see #unsetGrossCapacity()
     * @see #getGrossCapacity()
     * @see #setGrossCapacity(Float)
     * @generated
     */
    boolean isSetGrossCapacity();

    /**
     * Returns the value of the '<em><b>Normal Min Operate Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Min Operate Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Min Operate Level</em>' attribute.
     * @see #isSetNormalMinOperateLevel()
     * @see #unsetNormalMinOperateLevel()
     * @see #setNormalMinOperateLevel(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_NormalMinOperateLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.normalMinOperateLevel' kind='element'"
     * @generated
     */
    Float getNormalMinOperateLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Min Operate Level</em>' attribute.
     * @see #isSetNormalMinOperateLevel()
     * @see #unsetNormalMinOperateLevel()
     * @see #getNormalMinOperateLevel()
     * @generated
     */
    void setNormalMinOperateLevel( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalMinOperateLevel()
     * @see #getNormalMinOperateLevel()
     * @see #setNormalMinOperateLevel(Float)
     * @generated
     */
    void unsetNormalMinOperateLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getNormalMinOperateLevel <em>Normal Min Operate Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Min Operate Level</em>' attribute is set.
     * @see #unsetNormalMinOperateLevel()
     * @see #getNormalMinOperateLevel()
     * @see #setNormalMinOperateLevel(Float)
     * @generated
     */
    boolean isSetNormalMinOperateLevel();

    /**
     * Returns the value of the '<em><b>River Outlet Works</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>River Outlet Works</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>River Outlet Works</em>' attribute.
     * @see #isSetRiverOutletWorks()
     * @see #unsetRiverOutletWorks()
     * @see #setRiverOutletWorks(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_RiverOutletWorks()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.riverOutletWorks' kind='element'"
     * @generated
     */
    String getRiverOutletWorks();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>River Outlet Works</em>' attribute.
     * @see #isSetRiverOutletWorks()
     * @see #unsetRiverOutletWorks()
     * @see #getRiverOutletWorks()
     * @generated
     */
    void setRiverOutletWorks( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRiverOutletWorks()
     * @see #getRiverOutletWorks()
     * @see #setRiverOutletWorks(String)
     * @generated
     */
    void unsetRiverOutletWorks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getRiverOutletWorks <em>River Outlet Works</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>River Outlet Works</em>' attribute is set.
     * @see #unsetRiverOutletWorks()
     * @see #getRiverOutletWorks()
     * @see #setRiverOutletWorks(String)
     * @generated
     */
    boolean isSetRiverOutletWorks();

    /**
     * Returns the value of the '<em><b>Spill Travel Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spill Travel Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spill Travel Delay</em>' attribute.
     * @see #isSetSpillTravelDelay()
     * @see #unsetSpillTravelDelay()
     * @see #setSpillTravelDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillTravelDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.spillTravelDelay' kind='element'"
     * @generated
     */
    Float getSpillTravelDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spill Travel Delay</em>' attribute.
     * @see #isSetSpillTravelDelay()
     * @see #unsetSpillTravelDelay()
     * @see #getSpillTravelDelay()
     * @generated
     */
    void setSpillTravelDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillTravelDelay()
     * @see #getSpillTravelDelay()
     * @see #setSpillTravelDelay(Float)
     * @generated
     */
    void unsetSpillTravelDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillTravelDelay <em>Spill Travel Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spill Travel Delay</em>' attribute is set.
     * @see #unsetSpillTravelDelay()
     * @see #getSpillTravelDelay()
     * @see #setSpillTravelDelay(Float)
     * @generated
     */
    boolean isSetSpillTravelDelay();

    /**
     * Returns the value of the '<em><b>Spillway Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spillway Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spillway Capacity</em>' attribute.
     * @see #isSetSpillwayCapacity()
     * @see #unsetSpillwayCapacity()
     * @see #setSpillwayCapacity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillwayCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.spillwayCapacity' kind='element'"
     * @generated
     */
    Float getSpillwayCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spillway Capacity</em>' attribute.
     * @see #isSetSpillwayCapacity()
     * @see #unsetSpillwayCapacity()
     * @see #getSpillwayCapacity()
     * @generated
     */
    void setSpillwayCapacity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillwayCapacity()
     * @see #getSpillwayCapacity()
     * @see #setSpillwayCapacity(Float)
     * @generated
     */
    void unsetSpillwayCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCapacity <em>Spillway Capacity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spillway Capacity</em>' attribute is set.
     * @see #unsetSpillwayCapacity()
     * @see #getSpillwayCapacity()
     * @see #setSpillwayCapacity(Float)
     * @generated
     */
    boolean isSetSpillwayCapacity();

    /**
     * Returns the value of the '<em><b>Spillway Crest Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spillway Crest Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spillway Crest Length</em>' attribute.
     * @see #isSetSpillwayCrestLength()
     * @see #unsetSpillwayCrestLength()
     * @see #setSpillwayCrestLength(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillwayCrestLength()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.spillwayCrestLength' kind='element'"
     * @generated
     */
    Float getSpillwayCrestLength();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spillway Crest Length</em>' attribute.
     * @see #isSetSpillwayCrestLength()
     * @see #unsetSpillwayCrestLength()
     * @see #getSpillwayCrestLength()
     * @generated
     */
    void setSpillwayCrestLength( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillwayCrestLength()
     * @see #getSpillwayCrestLength()
     * @see #setSpillwayCrestLength(Float)
     * @generated
     */
    void unsetSpillwayCrestLength();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLength <em>Spillway Crest Length</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spillway Crest Length</em>' attribute is set.
     * @see #unsetSpillwayCrestLength()
     * @see #getSpillwayCrestLength()
     * @see #setSpillwayCrestLength(Float)
     * @generated
     */
    boolean isSetSpillwayCrestLength();

    /**
     * Returns the value of the '<em><b>Spillway Crest Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spillway Crest Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spillway Crest Level</em>' attribute.
     * @see #isSetSpillwayCrestLevel()
     * @see #unsetSpillwayCrestLevel()
     * @see #setSpillwayCrestLevel(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillwayCrestLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.spillwayCrestLevel' kind='element'"
     * @generated
     */
    Float getSpillwayCrestLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spillway Crest Level</em>' attribute.
     * @see #isSetSpillwayCrestLevel()
     * @see #unsetSpillwayCrestLevel()
     * @see #getSpillwayCrestLevel()
     * @generated
     */
    void setSpillwayCrestLevel( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillwayCrestLevel()
     * @see #getSpillwayCrestLevel()
     * @see #setSpillwayCrestLevel(Float)
     * @generated
     */
    void unsetSpillwayCrestLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillwayCrestLevel <em>Spillway Crest Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spillway Crest Level</em>' attribute is set.
     * @see #unsetSpillwayCrestLevel()
     * @see #getSpillwayCrestLevel()
     * @see #setSpillwayCrestLevel(Float)
     * @generated
     */
    boolean isSetSpillwayCrestLevel();

    /**
     * Returns the value of the '<em><b>Spill Way Gate Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spill Way Gate Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spill Way Gate Type</em>' attribute.
     * @see #isSetSpillWayGateType()
     * @see #unsetSpillWayGateType()
     * @see #setSpillWayGateType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillWayGateType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.spillWayGateType' kind='element'"
     * @generated
     */
    String getSpillWayGateType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spill Way Gate Type</em>' attribute.
     * @see #isSetSpillWayGateType()
     * @see #unsetSpillWayGateType()
     * @see #getSpillWayGateType()
     * @generated
     */
    void setSpillWayGateType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillWayGateType()
     * @see #getSpillWayGateType()
     * @see #setSpillWayGateType(String)
     * @generated
     */
    void unsetSpillWayGateType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillWayGateType <em>Spill Way Gate Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spill Way Gate Type</em>' attribute is set.
     * @see #unsetSpillWayGateType()
     * @see #getSpillWayGateType()
     * @see #setSpillWayGateType(String)
     * @generated
     */
    boolean isSetSpillWayGateType();

    /**
     * Returns the value of the '<em><b>Spills From Reservoir</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spills From Reservoir</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spills From Reservoir</em>' reference.
     * @see #isSetSpillsFromReservoir()
     * @see #unsetSpillsFromReservoir()
     * @see #setSpillsFromReservoir(Reservoir)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillsFromReservoir()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsIntoReservoirs
     * @model opposite="SpillsIntoReservoirs" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.SpillsFromReservoir' kind='element'"
     * @generated
     */
    Reservoir getSpillsFromReservoir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Spills From Reservoir</em>' reference.
     * @see #isSetSpillsFromReservoir()
     * @see #unsetSpillsFromReservoir()
     * @see #getSpillsFromReservoir()
     * @generated
     */
    void setSpillsFromReservoir( Reservoir value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillsFromReservoir()
     * @see #getSpillsFromReservoir()
     * @see #setSpillsFromReservoir(Reservoir)
     * @generated
     */
    void unsetSpillsFromReservoir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spills From Reservoir</em>' reference is set.
     * @see #unsetSpillsFromReservoir()
     * @see #getSpillsFromReservoir()
     * @see #setSpillsFromReservoir(Reservoir)
     * @generated
     */
    boolean isSetSpillsFromReservoir();

    /**
     * Returns the value of the '<em><b>Upstream From Hydro Power Plants</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upstream From Hydro Power Plants</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upstream From Hydro Power Plants</em>' reference list.
     * @see #isSetUpstreamFromHydroPowerPlants()
     * @see #unsetUpstreamFromHydroPowerPlants()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_UpstreamFromHydroPowerPlants()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir
     * @model opposite="GenSourcePumpDischargeReservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.UpstreamFromHydroPowerPlants' kind='element'"
     * @generated
     */
    EList< HydroPowerPlant > getUpstreamFromHydroPowerPlants();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpstreamFromHydroPowerPlants()
     * @see #getUpstreamFromHydroPowerPlants()
     * @generated
     */
    void unsetUpstreamFromHydroPowerPlants();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upstream From Hydro Power Plants</em>' reference list is set.
     * @see #unsetUpstreamFromHydroPowerPlants()
     * @see #getUpstreamFromHydroPowerPlants()
     * @generated
     */
    boolean isSetUpstreamFromHydroPowerPlants();

    /**
     * Returns the value of the '<em><b>Level Vs Volume Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir <em>Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Level Vs Volume Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Level Vs Volume Curves</em>' reference list.
     * @see #isSetLevelVsVolumeCurves()
     * @see #unsetLevelVsVolumeCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_LevelVsVolumeCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LevelVsVolumeCurve#getReservoir
     * @model opposite="Reservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.LevelVsVolumeCurves' kind='element'"
     * @generated
     */
    EList< LevelVsVolumeCurve > getLevelVsVolumeCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLevelVsVolumeCurves()
     * @see #getLevelVsVolumeCurves()
     * @generated
     */
    void unsetLevelVsVolumeCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getLevelVsVolumeCurves <em>Level Vs Volume Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Level Vs Volume Curves</em>' reference list is set.
     * @see #unsetLevelVsVolumeCurves()
     * @see #getLevelVsVolumeCurves()
     * @generated
     */
    boolean isSetLevelVsVolumeCurves();

    /**
     * Returns the value of the '<em><b>Inflow Forecasts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InflowForecast}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InflowForecast#getReservoir <em>Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inflow Forecasts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inflow Forecasts</em>' reference list.
     * @see #isSetInflowForecasts()
     * @see #unsetInflowForecasts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_InflowForecasts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InflowForecast#getReservoir
     * @model opposite="Reservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.InflowForecasts' kind='element'"
     * @generated
     */
    EList< InflowForecast > getInflowForecasts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInflowForecasts()
     * @see #getInflowForecasts()
     * @generated
     */
    void unsetInflowForecasts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getInflowForecasts <em>Inflow Forecasts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inflow Forecasts</em>' reference list is set.
     * @see #unsetInflowForecasts()
     * @see #getInflowForecasts()
     * @generated
     */
    boolean isSetInflowForecasts();

    /**
     * Returns the value of the '<em><b>Target Level Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir <em>Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Level Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Level Schedule</em>' reference.
     * @see #isSetTargetLevelSchedule()
     * @see #unsetTargetLevelSchedule()
     * @see #setTargetLevelSchedule(TargetLevelSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_TargetLevelSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule#getReservoir
     * @model opposite="Reservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.TargetLevelSchedule' kind='element'"
     * @generated
     */
    TargetLevelSchedule getTargetLevelSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Level Schedule</em>' reference.
     * @see #isSetTargetLevelSchedule()
     * @see #unsetTargetLevelSchedule()
     * @see #getTargetLevelSchedule()
     * @generated
     */
    void setTargetLevelSchedule( TargetLevelSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetLevelSchedule()
     * @see #getTargetLevelSchedule()
     * @see #setTargetLevelSchedule(TargetLevelSchedule)
     * @generated
     */
    void unsetTargetLevelSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getTargetLevelSchedule <em>Target Level Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Level Schedule</em>' reference is set.
     * @see #unsetTargetLevelSchedule()
     * @see #getTargetLevelSchedule()
     * @see #setTargetLevelSchedule(TargetLevelSchedule)
     * @generated
     */
    boolean isSetTargetLevelSchedule();

    /**
     * Returns the value of the '<em><b>Hydro Power Plants</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir <em>Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Power Plants</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Power Plants</em>' reference list.
     * @see #isSetHydroPowerPlants()
     * @see #unsetHydroPowerPlants()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_HydroPowerPlants()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir
     * @model opposite="Reservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.HydroPowerPlants' kind='element'"
     * @generated
     */
    EList< HydroPowerPlant > getHydroPowerPlants();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPowerPlants()
     * @see #getHydroPowerPlants()
     * @generated
     */
    void unsetHydroPowerPlants();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Power Plants</em>' reference list is set.
     * @see #unsetHydroPowerPlants()
     * @see #getHydroPowerPlants()
     * @generated
     */
    boolean isSetHydroPowerPlants();

    /**
     * Returns the value of the '<em><b>Spills Into Reservoirs</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir <em>Spills From Reservoir</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Spills Into Reservoirs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Spills Into Reservoirs</em>' reference list.
     * @see #isSetSpillsIntoReservoirs()
     * @see #unsetSpillsIntoReservoirs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReservoir_SpillsIntoReservoirs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsFromReservoir
     * @model opposite="SpillsFromReservoir" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Reservoir.SpillsIntoReservoirs' kind='element'"
     * @generated
     */
    EList< Reservoir > getSpillsIntoReservoirs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpillsIntoReservoirs()
     * @see #getSpillsIntoReservoirs()
     * @generated
     */
    void unsetSpillsIntoReservoirs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getSpillsIntoReservoirs <em>Spills Into Reservoirs</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Spills Into Reservoirs</em>' reference list is set.
     * @see #unsetSpillsIntoReservoirs()
     * @see #getSpillsIntoReservoirs()
     * @generated
     */
    boolean isSetSpillsIntoReservoirs();

} // Reservoir
