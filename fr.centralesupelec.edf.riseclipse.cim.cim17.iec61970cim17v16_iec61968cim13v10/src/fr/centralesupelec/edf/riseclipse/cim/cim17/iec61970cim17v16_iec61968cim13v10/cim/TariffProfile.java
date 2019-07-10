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
 * A representation of the model object '<em><b>Tariff Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffs <em>Tariffs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariffProfile()
 * @model
 * @generated
 */
public interface TariffProfile extends Document {
    /**
     * Returns the value of the '<em><b>Tariff Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tariff Cycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tariff Cycle</em>' attribute.
     * @see #isSetTariffCycle()
     * @see #unsetTariffCycle()
     * @see #setTariffCycle(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariffProfile_TariffCycle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TariffProfile.tariffCycle' kind='element'"
     * @generated
     */
    String getTariffCycle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tariff Cycle</em>' attribute.
     * @see #isSetTariffCycle()
     * @see #unsetTariffCycle()
     * @see #getTariffCycle()
     * @generated
     */
    void setTariffCycle( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTariffCycle()
     * @see #getTariffCycle()
     * @see #setTariffCycle(String)
     * @generated
     */
    void unsetTariffCycle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffCycle <em>Tariff Cycle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tariff Cycle</em>' attribute is set.
     * @see #unsetTariffCycle()
     * @see #getTariffCycle()
     * @see #setTariffCycle(String)
     * @generated
     */
    boolean isSetTariffCycle();

    /**
     * Returns the value of the '<em><b>Tariffs</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getTariffProfiles <em>Tariff Profiles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tariffs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tariffs</em>' reference list.
     * @see #isSetTariffs()
     * @see #unsetTariffs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariffProfile_Tariffs()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tariff#getTariffProfiles
     * @model opposite="TariffProfiles" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TariffProfile.Tariffs' kind='element'"
     * @generated
     */
    EList< Tariff > getTariffs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffs <em>Tariffs</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTariffs()
     * @see #getTariffs()
     * @generated
     */
    void unsetTariffs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTariffs <em>Tariffs</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tariffs</em>' reference list is set.
     * @see #unsetTariffs()
     * @see #getTariffs()
     * @generated
     */
    boolean isSetTariffs();

    /**
     * Returns the value of the '<em><b>Time Tariff Intervals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Tariff Intervals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Tariff Intervals</em>' reference list.
     * @see #isSetTimeTariffIntervals()
     * @see #unsetTimeTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariffProfile_TimeTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TimeTariffInterval#getTariffProfiles
     * @model opposite="TariffProfiles" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TariffProfile.TimeTariffIntervals' kind='element'"
     * @generated
     */
    EList< TimeTariffInterval > getTimeTariffIntervals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeTariffIntervals()
     * @see #getTimeTariffIntervals()
     * @generated
     */
    void unsetTimeTariffIntervals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getTimeTariffIntervals <em>Time Tariff Intervals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Tariff Intervals</em>' reference list is set.
     * @see #unsetTimeTariffIntervals()
     * @see #getTimeTariffIntervals()
     * @generated
     */
    boolean isSetTimeTariffIntervals();

    /**
     * Returns the value of the '<em><b>Consumption Tariff Intervals</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval#getTariffProfiles <em>Tariff Profiles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Consumption Tariff Intervals</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Consumption Tariff Intervals</em>' reference list.
     * @see #isSetConsumptionTariffIntervals()
     * @see #unsetConsumptionTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTariffProfile_ConsumptionTariffIntervals()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConsumptionTariffInterval#getTariffProfiles
     * @model opposite="TariffProfiles" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TariffProfile.ConsumptionTariffIntervals' kind='element'"
     * @generated
     */
    EList< ConsumptionTariffInterval > getConsumptionTariffIntervals();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConsumptionTariffIntervals()
     * @see #getConsumptionTariffIntervals()
     * @generated
     */
    void unsetConsumptionTariffIntervals();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TariffProfile#getConsumptionTariffIntervals <em>Consumption Tariff Intervals</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Consumption Tariff Intervals</em>' reference list is set.
     * @see #unsetConsumptionTariffIntervals()
     * @see #getConsumptionTariffIntervals()
     * @generated
     */
    boolean isSetConsumptionTariffIntervals();

} // TariffProfile
