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
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getInService <em>In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getNormallyInService <em>Normally In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getFaults <em>Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getUsagePoints <em>Usage Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalRestrictions <em>Operational Restrictions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOutages <em>Outages</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #setAggregate(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_Aggregate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.aggregate' kind='element'"
     * @generated
     */
    Boolean getAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @generated
     */
    void setAggregate( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(Boolean)
     * @generated
     */
    void unsetAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aggregate</em>' attribute is set.
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(Boolean)
     * @generated
     */
    boolean isSetAggregate();

    /**
     * Returns the value of the '<em><b>In Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Service</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Service</em>' attribute.
     * @see #isSetInService()
     * @see #unsetInService()
     * @see #setInService(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_InService()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.inService' kind='element'"
     * @generated
     */
    Boolean getInService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getInService <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Service</em>' attribute.
     * @see #isSetInService()
     * @see #unsetInService()
     * @see #getInService()
     * @generated
     */
    void setInService( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getInService <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInService()
     * @see #getInService()
     * @see #setInService(Boolean)
     * @generated
     */
    void unsetInService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getInService <em>In Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Service</em>' attribute is set.
     * @see #unsetInService()
     * @see #getInService()
     * @see #setInService(Boolean)
     * @generated
     */
    boolean isSetInService();

    /**
     * Returns the value of the '<em><b>Normally In Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normally In Service</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normally In Service</em>' attribute.
     * @see #isSetNormallyInService()
     * @see #unsetNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_NormallyInService()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.normallyInService' kind='element'"
     * @generated
     */
    Boolean getNormallyInService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normally In Service</em>' attribute.
     * @see #isSetNormallyInService()
     * @see #unsetNormallyInService()
     * @see #getNormallyInService()
     * @generated
     */
    void setNormallyInService( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormallyInService()
     * @see #getNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @generated
     */
    void unsetNormallyInService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normally In Service</em>' attribute is set.
     * @see #unsetNormallyInService()
     * @see #getNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @generated
     */
    boolean isSetNormallyInService();

    /**
     * Returns the value of the '<em><b>Contingency Equipment</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment <em>Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contingency Equipment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contingency Equipment</em>' reference list.
     * @see #isSetContingencyEquipment()
     * @see #unsetContingencyEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_ContingencyEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ContingencyEquipment#getEquipment
     * @model opposite="Equipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.ContingencyEquipment' kind='element'"
     * @generated
     */
    EList< ContingencyEquipment > getContingencyEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContingencyEquipment()
     * @see #getContingencyEquipment()
     * @generated
     */
    void unsetContingencyEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getContingencyEquipment <em>Contingency Equipment</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contingency Equipment</em>' reference list is set.
     * @see #unsetContingencyEquipment()
     * @see #getContingencyEquipment()
     * @generated
     */
    boolean isSetContingencyEquipment();

    /**
     * Returns the value of the '<em><b>Faults</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment <em>Faulty Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' reference list.
     * @see #isSetFaults()
     * @see #unsetFaults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_Faults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Fault#getFaultyEquipment
     * @model opposite="FaultyEquipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.Faults' kind='element'"
     * @generated
     */
    EList< Fault > getFaults();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getFaults <em>Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFaults()
     * @see #getFaults()
     * @generated
     */
    void unsetFaults();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getFaults <em>Faults</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Faults</em>' reference list is set.
     * @see #unsetFaults()
     * @see #getFaults()
     * @generated
     */
    boolean isSetFaults();

    /**
     * Returns the value of the '<em><b>Usage Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEquipments <em>Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Points</em>' reference list.
     * @see #isSetUsagePoints()
     * @see #unsetUsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_UsagePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint#getEquipments
     * @model opposite="Equipments" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.UsagePoints' kind='element'"
     * @generated
     */
    EList< UsagePoint > getUsagePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getUsagePoints <em>Usage Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    void unsetUsagePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getUsagePoints <em>Usage Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage Points</em>' reference list is set.
     * @see #unsetUsagePoints()
     * @see #getUsagePoints()
     * @generated
     */
    boolean isSetUsagePoints();

    /**
     * Returns the value of the '<em><b>Operational Restrictions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getEquipments <em>Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Restrictions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Restrictions</em>' reference list.
     * @see #isSetOperationalRestrictions()
     * @see #unsetOperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_OperationalRestrictions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalRestriction#getEquipments
     * @model opposite="Equipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.OperationalRestrictions' kind='element'"
     * @generated
     */
    EList< OperationalRestriction > getOperationalRestrictions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    void unsetOperationalRestrictions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalRestrictions <em>Operational Restrictions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Restrictions</em>' reference list is set.
     * @see #unsetOperationalRestrictions()
     * @see #getOperationalRestrictions()
     * @generated
     */
    boolean isSetOperationalRestrictions();

    /**
     * Returns the value of the '<em><b>Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentContainer#getEquipments <em>Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equipment Container</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipment Container</em>' reference.
     * @see #isSetEquipmentContainer()
     * @see #unsetEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_EquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentContainer#getEquipments
     * @model opposite="Equipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.EquipmentContainer' kind='element'"
     * @generated
     */
    EquipmentContainer getEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equipment Container</em>' reference.
     * @see #isSetEquipmentContainer()
     * @see #unsetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @generated
     */
    void setEquipmentContainer( EquipmentContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @generated
     */
    void unsetEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipment Container</em>' reference is set.
     * @see #unsetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @generated
     */
    boolean isSetEquipmentContainer();

    /**
     * Returns the value of the '<em><b>Outages</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getEquipments <em>Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outages</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outages</em>' reference list.
     * @see #isSetOutages()
     * @see #unsetOutages()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_Outages()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage#getEquipments
     * @model opposite="Equipments" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.Outages' kind='element'"
     * @generated
     */
    EList< Outage > getOutages();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOutages <em>Outages</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutages()
     * @see #getOutages()
     * @generated
     */
    void unsetOutages();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOutages <em>Outages</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outages</em>' reference list is set.
     * @see #unsetOutages()
     * @see #getOutages()
     * @generated
     */
    boolean isSetOutages();

    /**
     * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operational Limit Set</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operational Limit Set</em>' reference list.
     * @see #isSetOperationalLimitSet()
     * @see #unsetOperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getEquipment_OperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationalLimitSet#getEquipment
     * @model opposite="Equipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Equipment.OperationalLimitSet' kind='element'"
     * @generated
     */
    EList< OperationalLimitSet > getOperationalLimitSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    void unsetOperationalLimitSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Set</em>' reference list is set.
     * @see #unsetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    boolean isSetOperationalLimitSet();

} // Equipment
