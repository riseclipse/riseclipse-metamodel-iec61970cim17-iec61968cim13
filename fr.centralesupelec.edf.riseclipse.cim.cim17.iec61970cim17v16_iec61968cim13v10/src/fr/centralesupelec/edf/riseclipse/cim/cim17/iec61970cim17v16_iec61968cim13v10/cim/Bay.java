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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayPowerMeasFlag <em>Bay Power Meas Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getSubstation <em>Substation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay()
 * @model
 * @generated
 */
public interface Bay extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Bay Energy Meas Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay Energy Meas Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay Energy Meas Flag</em>' attribute.
     * @see #isSetBayEnergyMeasFlag()
     * @see #unsetBayEnergyMeasFlag()
     * @see #setBayEnergyMeasFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_BayEnergyMeasFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.bayEnergyMeasFlag' kind='element'"
     * @generated
     */
    Boolean getBayEnergyMeasFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay Energy Meas Flag</em>' attribute.
     * @see #isSetBayEnergyMeasFlag()
     * @see #unsetBayEnergyMeasFlag()
     * @see #getBayEnergyMeasFlag()
     * @generated
     */
    void setBayEnergyMeasFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBayEnergyMeasFlag()
     * @see #getBayEnergyMeasFlag()
     * @see #setBayEnergyMeasFlag(Boolean)
     * @generated
     */
    void unsetBayEnergyMeasFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayEnergyMeasFlag <em>Bay Energy Meas Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bay Energy Meas Flag</em>' attribute is set.
     * @see #unsetBayEnergyMeasFlag()
     * @see #getBayEnergyMeasFlag()
     * @see #setBayEnergyMeasFlag(Boolean)
     * @generated
     */
    boolean isSetBayEnergyMeasFlag();

    /**
     * Returns the value of the '<em><b>Bay Power Meas Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay Power Meas Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay Power Meas Flag</em>' attribute.
     * @see #isSetBayPowerMeasFlag()
     * @see #unsetBayPowerMeasFlag()
     * @see #setBayPowerMeasFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_BayPowerMeasFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.bayPowerMeasFlag' kind='element'"
     * @generated
     */
    Boolean getBayPowerMeasFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay Power Meas Flag</em>' attribute.
     * @see #isSetBayPowerMeasFlag()
     * @see #unsetBayPowerMeasFlag()
     * @see #getBayPowerMeasFlag()
     * @generated
     */
    void setBayPowerMeasFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBayPowerMeasFlag()
     * @see #getBayPowerMeasFlag()
     * @see #setBayPowerMeasFlag(Boolean)
     * @generated
     */
    void unsetBayPowerMeasFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBayPowerMeasFlag <em>Bay Power Meas Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bay Power Meas Flag</em>' attribute is set.
     * @see #unsetBayPowerMeasFlag()
     * @see #getBayPowerMeasFlag()
     * @see #setBayPowerMeasFlag(Boolean)
     * @generated
     */
    boolean isSetBayPowerMeasFlag();

    /**
     * Returns the value of the '<em><b>Breaker Configuration</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Breaker Configuration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Breaker Configuration</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerConfiguration
     * @see #isSetBreakerConfiguration()
     * @see #unsetBreakerConfiguration()
     * @see #setBreakerConfiguration(BreakerConfiguration)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_BreakerConfiguration()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.breakerConfiguration' kind='element'"
     * @generated
     */
    BreakerConfiguration getBreakerConfiguration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Breaker Configuration</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BreakerConfiguration
     * @see #isSetBreakerConfiguration()
     * @see #unsetBreakerConfiguration()
     * @see #getBreakerConfiguration()
     * @generated
     */
    void setBreakerConfiguration( BreakerConfiguration value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBreakerConfiguration()
     * @see #getBreakerConfiguration()
     * @see #setBreakerConfiguration(BreakerConfiguration)
     * @generated
     */
    void unsetBreakerConfiguration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBreakerConfiguration <em>Breaker Configuration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Breaker Configuration</em>' attribute is set.
     * @see #unsetBreakerConfiguration()
     * @see #getBreakerConfiguration()
     * @see #setBreakerConfiguration(BreakerConfiguration)
     * @generated
     */
    boolean isSetBreakerConfiguration();

    /**
     * Returns the value of the '<em><b>Bus Bar Configuration</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bus Bar Configuration</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bus Bar Configuration</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarConfiguration
     * @see #isSetBusBarConfiguration()
     * @see #unsetBusBarConfiguration()
     * @see #setBusBarConfiguration(BusbarConfiguration)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_BusBarConfiguration()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.busBarConfiguration' kind='element'"
     * @generated
     */
    BusbarConfiguration getBusBarConfiguration();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bus Bar Configuration</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarConfiguration
     * @see #isSetBusBarConfiguration()
     * @see #unsetBusBarConfiguration()
     * @see #getBusBarConfiguration()
     * @generated
     */
    void setBusBarConfiguration( BusbarConfiguration value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusBarConfiguration()
     * @see #getBusBarConfiguration()
     * @see #setBusBarConfiguration(BusbarConfiguration)
     * @generated
     */
    void unsetBusBarConfiguration();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getBusBarConfiguration <em>Bus Bar Configuration</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bus Bar Configuration</em>' attribute is set.
     * @see #unsetBusBarConfiguration()
     * @see #getBusBarConfiguration()
     * @see #setBusBarConfiguration(BusbarConfiguration)
     * @generated
     */
    boolean isSetBusBarConfiguration();

    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageLevel#getBays <em>Bays</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Level</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageLevel#getBays
     * @model opposite="Bays" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.VoltageLevel' kind='element'"
     * @generated
     */
    VoltageLevel getVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    void setVoltageLevel( VoltageLevel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    void unsetVoltageLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getVoltageLevel <em>Voltage Level</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level</em>' reference is set.
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    boolean isSetVoltageLevel();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation#getBays <em>Bays</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBay_Substation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Substation#getBays
     * @model opposite="Bays" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Bay.Substation' kind='element'"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Bay#getSubstation <em>Substation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' reference is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    boolean isSetSubstation();

} // Bay
