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
 * A representation of the model object '<em><b>Synchronous Machine Detailed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineDetailed()
 * @model
 * @generated
 */
public interface SynchronousMachineDetailed extends SynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Efd Base Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efd Base Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efd Base Ratio</em>' attribute.
     * @see #isSetEfdBaseRatio()
     * @see #unsetEfdBaseRatio()
     * @see #setEfdBaseRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineDetailed_EfdBaseRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineDetailed.efdBaseRatio' kind='element'"
     * @generated
     */
    Float getEfdBaseRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd Base Ratio</em>' attribute.
     * @see #isSetEfdBaseRatio()
     * @see #unsetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @generated
     */
    void setEfdBaseRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @see #setEfdBaseRatio(Float)
     * @generated
     */
    void unsetEfdBaseRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd Base Ratio</em>' attribute is set.
     * @see #unsetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @see #setEfdBaseRatio(Float)
     * @generated
     */
    boolean isSetEfdBaseRatio();

    /**
     * Returns the value of the '<em><b>Ifd Base Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IfdBaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ifd Base Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ifd Base Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IfdBaseKind
     * @see #isSetIfdBaseType()
     * @see #unsetIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineDetailed_IfdBaseType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineDetailed.ifdBaseType' kind='element'"
     * @generated
     */
    IfdBaseKind getIfdBaseType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifd Base Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IfdBaseKind
     * @see #isSetIfdBaseType()
     * @see #unsetIfdBaseType()
     * @see #getIfdBaseType()
     * @generated
     */
    void setIfdBaseType( IfdBaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdBaseType()
     * @see #getIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @generated
     */
    void unsetIfdBaseType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifd Base Type</em>' attribute is set.
     * @see #unsetIfdBaseType()
     * @see #getIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @generated
     */
    boolean isSetIfdBaseType();

    /**
     * Returns the value of the '<em><b>Saturation Factor120 QAxis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Saturation Factor120 QAxis</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saturation Factor120 QAxis</em>' attribute.
     * @see #isSetSaturationFactor120QAxis()
     * @see #unsetSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineDetailed_SaturationFactor120QAxis()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineDetailed.saturationFactor120QAxis' kind='element'"
     * @generated
     */
    Float getSaturationFactor120QAxis();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor120 QAxis</em>' attribute.
     * @see #isSetSaturationFactor120QAxis()
     * @see #unsetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @generated
     */
    void setSaturationFactor120QAxis( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Float)
     * @generated
     */
    void unsetSaturationFactor120QAxis();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor120 QAxis</em>' attribute is set.
     * @see #unsetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Float)
     * @generated
     */
    boolean isSetSaturationFactor120QAxis();

    /**
     * Returns the value of the '<em><b>Saturation Factor QAxis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Saturation Factor QAxis</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Saturation Factor QAxis</em>' attribute.
     * @see #isSetSaturationFactorQAxis()
     * @see #unsetSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineDetailed_SaturationFactorQAxis()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineDetailed.saturationFactorQAxis' kind='element'"
     * @generated
     */
    Float getSaturationFactorQAxis();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor QAxis</em>' attribute.
     * @see #isSetSaturationFactorQAxis()
     * @see #unsetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @generated
     */
    void setSaturationFactorQAxis( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Float)
     * @generated
     */
    void unsetSaturationFactorQAxis();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor QAxis</em>' attribute is set.
     * @see #unsetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Float)
     * @generated
     */
    boolean isSetSaturationFactorQAxis();

} // SynchronousMachineDetailed
