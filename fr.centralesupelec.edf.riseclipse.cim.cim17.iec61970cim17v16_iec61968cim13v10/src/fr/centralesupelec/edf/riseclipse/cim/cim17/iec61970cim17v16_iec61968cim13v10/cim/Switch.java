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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRetained <em>Retained</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnCount <em>Switch On Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnDate <em>Switch On Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch <em>Composite Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOutage <em>Outage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction <em>Switch Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchPhase <em>Switch Phase</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal Open</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_NormalOpen()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.normalOpen' kind='element'"
     * @generated
     */
    Boolean getNormalOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @generated
     */
    void setNormalOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    void unsetNormalOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Open</em>' attribute is set.
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    boolean isSetNormalOpen();

    /**
     * Returns the value of the '<em><b>Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Open</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #setOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_Open()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.open' kind='element'"
     * @generated
     */
    Boolean getOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #getOpen()
     * @generated
     */
    void setOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    void unsetOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOpen <em>Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open</em>' attribute is set.
     * @see #unsetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    boolean isSetOpen();

    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_RatedCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.ratedCurrent' kind='element'"
     * @generated
     */
    Float getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Float)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Retained</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retained</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Retained</em>' attribute.
     * @see #isSetRetained()
     * @see #unsetRetained()
     * @see #setRetained(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_Retained()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.retained' kind='element'"
     * @generated
     */
    Boolean getRetained();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRetained <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retained</em>' attribute.
     * @see #isSetRetained()
     * @see #unsetRetained()
     * @see #getRetained()
     * @generated
     */
    void setRetained( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRetained <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRetained()
     * @see #getRetained()
     * @see #setRetained(Boolean)
     * @generated
     */
    void unsetRetained();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getRetained <em>Retained</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retained</em>' attribute is set.
     * @see #unsetRetained()
     * @see #getRetained()
     * @see #setRetained(Boolean)
     * @generated
     */
    boolean isSetRetained();

    /**
     * Returns the value of the '<em><b>Switch On Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch On Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch On Count</em>' attribute.
     * @see #isSetSwitchOnCount()
     * @see #unsetSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_SwitchOnCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.switchOnCount' kind='element'"
     * @generated
     */
    Integer getSwitchOnCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch On Count</em>' attribute.
     * @see #isSetSwitchOnCount()
     * @see #unsetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @generated
     */
    void setSwitchOnCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @generated
     */
    void unsetSwitchOnCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnCount <em>Switch On Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch On Count</em>' attribute is set.
     * @see #unsetSwitchOnCount()
     * @see #getSwitchOnCount()
     * @see #setSwitchOnCount(Integer)
     * @generated
     */
    boolean isSetSwitchOnCount();

    /**
     * Returns the value of the '<em><b>Switch On Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch On Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch On Date</em>' attribute.
     * @see #isSetSwitchOnDate()
     * @see #unsetSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_SwitchOnDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.switchOnDate' kind='element'"
     * @generated
     */
    Date getSwitchOnDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch On Date</em>' attribute.
     * @see #isSetSwitchOnDate()
     * @see #unsetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @generated
     */
    void setSwitchOnDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @generated
     */
    void unsetSwitchOnDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchOnDate <em>Switch On Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch On Date</em>' attribute is set.
     * @see #unsetSwitchOnDate()
     * @see #getSwitchOnDate()
     * @see #setSwitchOnDate(Date)
     * @generated
     */
    boolean isSetSwitchOnDate();

    /**
     * Returns the value of the '<em><b>Switch Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Schedules</em>' reference list.
     * @see #isSetSwitchSchedules()
     * @see #unsetSwitchSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_SwitchSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch
     * @model opposite="Switch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.SwitchSchedules' kind='element'"
     * @generated
     */
    EList< SwitchSchedule > getSwitchSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchSchedules()
     * @see #getSwitchSchedules()
     * @generated
     */
    void unsetSwitchSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch Schedules</em>' reference list is set.
     * @see #unsetSwitchSchedules()
     * @see #getSwitchSchedules()
     * @generated
     */
    boolean isSetSwitchSchedules();

    /**
     * Returns the value of the '<em><b>Composite Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getSwitches <em>Switches</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Composite Switch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Composite Switch</em>' reference.
     * @see #isSetCompositeSwitch()
     * @see #unsetCompositeSwitch()
     * @see #setCompositeSwitch(CompositeSwitch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_CompositeSwitch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CompositeSwitch#getSwitches
     * @model opposite="Switches" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.CompositeSwitch' kind='element'"
     * @generated
     */
    CompositeSwitch getCompositeSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch <em>Composite Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Composite Switch</em>' reference.
     * @see #isSetCompositeSwitch()
     * @see #unsetCompositeSwitch()
     * @see #getCompositeSwitch()
     * @generated
     */
    void setCompositeSwitch( CompositeSwitch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch <em>Composite Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCompositeSwitch()
     * @see #getCompositeSwitch()
     * @see #setCompositeSwitch(CompositeSwitch)
     * @generated
     */
    void unsetCompositeSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getCompositeSwitch <em>Composite Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Composite Switch</em>' reference is set.
     * @see #unsetCompositeSwitch()
     * @see #getCompositeSwitch()
     * @see #setCompositeSwitch(CompositeSwitch)
     * @generated
     */
    boolean isSetCompositeSwitch();

    /**
     * Returns the value of the '<em><b>Outage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getOpenedSwitches <em>Opened Switches</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outage</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #setOutage(Outage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_Outage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getOpenedSwitches
     * @model opposite="OpenedSwitches" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.Outage' kind='element'"
     * @generated
     */
    Outage getOutage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outage</em>' reference.
     * @see #isSetOutage()
     * @see #unsetOutage()
     * @see #getOutage()
     * @generated
     */
    void setOutage( Outage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOutage <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    void unsetOutage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getOutage <em>Outage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outage</em>' reference is set.
     * @see #unsetOutage()
     * @see #getOutage()
     * @see #setOutage(Outage)
     * @generated
     */
    boolean isSetOutage();

    /**
     * Returns the value of the '<em><b>Switch Action</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch <em>Operated Switch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch Action</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Action</em>' reference.
     * @see #isSetSwitchAction()
     * @see #unsetSwitchAction()
     * @see #setSwitchAction(SwitchAction)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_SwitchAction()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction#getOperatedSwitch
     * @model opposite="OperatedSwitch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.SwitchAction' kind='element'"
     * @generated
     */
    SwitchAction getSwitchAction();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction <em>Switch Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch Action</em>' reference.
     * @see #isSetSwitchAction()
     * @see #unsetSwitchAction()
     * @see #getSwitchAction()
     * @generated
     */
    void setSwitchAction( SwitchAction value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction <em>Switch Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchAction()
     * @see #getSwitchAction()
     * @see #setSwitchAction(SwitchAction)
     * @generated
     */
    void unsetSwitchAction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchAction <em>Switch Action</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch Action</em>' reference is set.
     * @see #unsetSwitchAction()
     * @see #getSwitchAction()
     * @see #setSwitchAction(SwitchAction)
     * @generated
     */
    boolean isSetSwitchAction();

    /**
     * Returns the value of the '<em><b>Connect Disconnect Functions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getSwitches <em>Switches</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connect Disconnect Functions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connect Disconnect Functions</em>' reference list.
     * @see #isSetConnectDisconnectFunctions()
     * @see #unsetConnectDisconnectFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_ConnectDisconnectFunctions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction#getSwitches
     * @model opposite="Switches" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.ConnectDisconnectFunctions' kind='element'"
     * @generated
     */
    EList< ConnectDisconnectFunction > getConnectDisconnectFunctions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectDisconnectFunctions()
     * @see #getConnectDisconnectFunctions()
     * @generated
     */
    void unsetConnectDisconnectFunctions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getConnectDisconnectFunctions <em>Connect Disconnect Functions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connect Disconnect Functions</em>' reference list is set.
     * @see #unsetConnectDisconnectFunctions()
     * @see #getConnectDisconnectFunctions()
     * @generated
     */
    boolean isSetConnectDisconnectFunctions();

    /**
     * Returns the value of the '<em><b>Switch Phase</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch Phase</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch Phase</em>' reference list.
     * @see #isSetSwitchPhase()
     * @see #unsetSwitchPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitch_SwitchPhase()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase#getSwitch
     * @model opposite="Switch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Switch.SwitchPhase' kind='element'"
     * @generated
     */
    EList< SwitchPhase > getSwitchPhase();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchPhase <em>Switch Phase</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchPhase()
     * @see #getSwitchPhase()
     * @generated
     */
    void unsetSwitchPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchPhase <em>Switch Phase</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch Phase</em>' reference list is set.
     * @see #unsetSwitchPhase()
     * @see #getSwitchPhase()
     * @generated
     */
    boolean isSetSwitchPhase();

} // Switch
