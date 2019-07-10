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
 * A representation of the model object '<em><b>Transformer Tank Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTankInfo()
 * @model
 * @generated
 */
public interface TransformerTankInfo extends AssetInfo {
    /**
     * Returns the value of the '<em><b>Transformer End Infos</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo <em>Transformer Tank Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer End Infos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer End Infos</em>' reference list.
     * @see #isSetTransformerEndInfos()
     * @see #unsetTransformerEndInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTankInfo_TransformerEndInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo#getTransformerTankInfo
     * @model opposite="TransformerTankInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerTankInfo.TransformerEndInfos' kind='element'"
     * @generated
     */
    EList< TransformerEndInfo > getTransformerEndInfos();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEndInfos()
     * @see #getTransformerEndInfos()
     * @generated
     */
    void unsetTransformerEndInfos();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getTransformerEndInfos <em>Transformer End Infos</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End Infos</em>' reference list is set.
     * @see #unsetTransformerEndInfos()
     * @see #getTransformerEndInfos()
     * @generated
     */
    boolean isSetTransformerEndInfos();

    /**
     * Returns the value of the '<em><b>Power Transformer Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerInfo#getTransformerTankInfos <em>Transformer Tank Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Transformer Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Transformer Info</em>' reference.
     * @see #isSetPowerTransformerInfo()
     * @see #unsetPowerTransformerInfo()
     * @see #setPowerTransformerInfo(PowerTransformerInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTransformerTankInfo_PowerTransformerInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerInfo#getTransformerTankInfos
     * @model opposite="TransformerTankInfos" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TransformerTankInfo.PowerTransformerInfo' kind='element'"
     * @generated
     */
    PowerTransformerInfo getPowerTransformerInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Transformer Info</em>' reference.
     * @see #isSetPowerTransformerInfo()
     * @see #unsetPowerTransformerInfo()
     * @see #getPowerTransformerInfo()
     * @generated
     */
    void setPowerTransformerInfo( PowerTransformerInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerTransformerInfo()
     * @see #getPowerTransformerInfo()
     * @see #setPowerTransformerInfo(PowerTransformerInfo)
     * @generated
     */
    void unsetPowerTransformerInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo#getPowerTransformerInfo <em>Power Transformer Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Transformer Info</em>' reference is set.
     * @see #unsetPowerTransformerInfo()
     * @see #getPowerTransformerInfo()
     * @see #setPowerTransformerInfo(PowerTransformerInfo)
     * @generated
     */
    boolean isSetPowerTransformerInfo();

} // TransformerTankInfo
