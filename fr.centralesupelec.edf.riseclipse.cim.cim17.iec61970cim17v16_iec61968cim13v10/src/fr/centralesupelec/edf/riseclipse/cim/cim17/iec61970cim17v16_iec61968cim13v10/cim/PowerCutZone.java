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
 * A representation of the model object '<em><b>Power Cut Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerCutZone()
 * @model
 * @generated
 */
public interface PowerCutZone extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Cut Level1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cut Level1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cut Level1</em>' attribute.
     * @see #isSetCutLevel1()
     * @see #unsetCutLevel1()
     * @see #setCutLevel1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerCutZone_CutLevel1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerCutZone.cutLevel1' kind='element'"
     * @generated
     */
    Float getCutLevel1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cut Level1</em>' attribute.
     * @see #isSetCutLevel1()
     * @see #unsetCutLevel1()
     * @see #getCutLevel1()
     * @generated
     */
    void setCutLevel1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCutLevel1()
     * @see #getCutLevel1()
     * @see #setCutLevel1(Float)
     * @generated
     */
    void unsetCutLevel1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel1 <em>Cut Level1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cut Level1</em>' attribute is set.
     * @see #unsetCutLevel1()
     * @see #getCutLevel1()
     * @see #setCutLevel1(Float)
     * @generated
     */
    boolean isSetCutLevel1();

    /**
     * Returns the value of the '<em><b>Cut Level2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cut Level2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cut Level2</em>' attribute.
     * @see #isSetCutLevel2()
     * @see #unsetCutLevel2()
     * @see #setCutLevel2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerCutZone_CutLevel2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerCutZone.cutLevel2' kind='element'"
     * @generated
     */
    Float getCutLevel2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cut Level2</em>' attribute.
     * @see #isSetCutLevel2()
     * @see #unsetCutLevel2()
     * @see #getCutLevel2()
     * @generated
     */
    void setCutLevel2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCutLevel2()
     * @see #getCutLevel2()
     * @see #setCutLevel2(Float)
     * @generated
     */
    void unsetCutLevel2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getCutLevel2 <em>Cut Level2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cut Level2</em>' attribute is set.
     * @see #unsetCutLevel2()
     * @see #getCutLevel2()
     * @see #setCutLevel2(Float)
     * @generated
     */
    boolean isSetCutLevel2();

    /**
     * Returns the value of the '<em><b>Energy Consumers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone <em>Power Cut Zone</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Consumers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Consumers</em>' reference list.
     * @see #isSetEnergyConsumers()
     * @see #unsetEnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPowerCutZone_EnergyConsumers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergyConsumer#getPowerCutZone
     * @model opposite="PowerCutZone" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PowerCutZone.EnergyConsumers' kind='element'"
     * @generated
     */
    EList< EnergyConsumer > getEnergyConsumers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    void unsetEnergyConsumers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerCutZone#getEnergyConsumers <em>Energy Consumers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Consumers</em>' reference list is set.
     * @see #unsetEnergyConsumers()
     * @see #getEnergyConsumers()
     * @generated
     */
    boolean isSetEnergyConsumers();

} // PowerCutZone
