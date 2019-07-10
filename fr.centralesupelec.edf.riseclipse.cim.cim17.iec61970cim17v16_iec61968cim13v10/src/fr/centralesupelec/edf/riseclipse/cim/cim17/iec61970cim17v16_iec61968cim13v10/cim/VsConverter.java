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
 * A representation of the model object '<em><b>Vs Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDelta <em>Delta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroop <em>Droop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxValveCurrent <em>Max Valve Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQPccControl <em>QPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQShare <em>QShare</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getUv <em>Uv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter()
 * @model
 * @generated
 */
public interface VsConverter extends ACDCConverter {
    /**
     * Returns the value of the '<em><b>Delta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delta</em>' attribute.
     * @see #isSetDelta()
     * @see #unsetDelta()
     * @see #setDelta(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_Delta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.delta' kind='element'"
     * @generated
     */
    Float getDelta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDelta <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delta</em>' attribute.
     * @see #isSetDelta()
     * @see #unsetDelta()
     * @see #getDelta()
     * @generated
     */
    void setDelta( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDelta <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelta()
     * @see #getDelta()
     * @see #setDelta(Float)
     * @generated
     */
    void unsetDelta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDelta <em>Delta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delta</em>' attribute is set.
     * @see #unsetDelta()
     * @see #getDelta()
     * @see #setDelta(Float)
     * @generated
     */
    boolean isSetDelta();

    /**
     * Returns the value of the '<em><b>Droop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Droop</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Droop</em>' attribute.
     * @see #isSetDroop()
     * @see #unsetDroop()
     * @see #setDroop(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_Droop()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.droop' kind='element'"
     * @generated
     */
    Float getDroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroop <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Droop</em>' attribute.
     * @see #isSetDroop()
     * @see #unsetDroop()
     * @see #getDroop()
     * @generated
     */
    void setDroop( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroop <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDroop()
     * @see #getDroop()
     * @see #setDroop(Float)
     * @generated
     */
    void unsetDroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroop <em>Droop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Droop</em>' attribute is set.
     * @see #unsetDroop()
     * @see #getDroop()
     * @see #setDroop(Float)
     * @generated
     */
    boolean isSetDroop();

    /**
     * Returns the value of the '<em><b>Droop Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Droop Compensation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Droop Compensation</em>' attribute.
     * @see #isSetDroopCompensation()
     * @see #unsetDroopCompensation()
     * @see #setDroopCompensation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_DroopCompensation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.droopCompensation' kind='element'"
     * @generated
     */
    Float getDroopCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Droop Compensation</em>' attribute.
     * @see #isSetDroopCompensation()
     * @see #unsetDroopCompensation()
     * @see #getDroopCompensation()
     * @generated
     */
    void setDroopCompensation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDroopCompensation()
     * @see #getDroopCompensation()
     * @see #setDroopCompensation(Float)
     * @generated
     */
    void unsetDroopCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Droop Compensation</em>' attribute is set.
     * @see #unsetDroopCompensation()
     * @see #getDroopCompensation()
     * @see #setDroopCompensation(Float)
     * @generated
     */
    boolean isSetDroopCompensation();

    /**
     * Returns the value of the '<em><b>Max Modulation Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Modulation Index</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Modulation Index</em>' attribute.
     * @see #isSetMaxModulationIndex()
     * @see #unsetMaxModulationIndex()
     * @see #setMaxModulationIndex(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_MaxModulationIndex()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.maxModulationIndex' kind='element'"
     * @generated
     */
    Float getMaxModulationIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Modulation Index</em>' attribute.
     * @see #isSetMaxModulationIndex()
     * @see #unsetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @generated
     */
    void setMaxModulationIndex( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @see #setMaxModulationIndex(Float)
     * @generated
     */
    void unsetMaxModulationIndex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Modulation Index</em>' attribute is set.
     * @see #unsetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @see #setMaxModulationIndex(Float)
     * @generated
     */
    boolean isSetMaxModulationIndex();

    /**
     * Returns the value of the '<em><b>Max Valve Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Valve Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Valve Current</em>' attribute.
     * @see #isSetMaxValveCurrent()
     * @see #unsetMaxValveCurrent()
     * @see #setMaxValveCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_MaxValveCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.maxValveCurrent' kind='element'"
     * @generated
     */
    Float getMaxValveCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxValveCurrent <em>Max Valve Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Valve Current</em>' attribute.
     * @see #isSetMaxValveCurrent()
     * @see #unsetMaxValveCurrent()
     * @see #getMaxValveCurrent()
     * @generated
     */
    void setMaxValveCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxValveCurrent <em>Max Valve Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxValveCurrent()
     * @see #getMaxValveCurrent()
     * @see #setMaxValveCurrent(Float)
     * @generated
     */
    void unsetMaxValveCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getMaxValveCurrent <em>Max Valve Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Valve Current</em>' attribute is set.
     * @see #unsetMaxValveCurrent()
     * @see #getMaxValveCurrent()
     * @see #setMaxValveCurrent(Float)
     * @generated
     */
    boolean isSetMaxValveCurrent();

    /**
     * Returns the value of the '<em><b>PPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsPpccControlKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>PPcc Control</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_PPccControl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.pPccControl' kind='element'"
     * @generated
     */
    VsPpccControlKind getPPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @generated
     */
    void setPPccControl( VsPpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @generated
     */
    void unsetPPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PPcc Control</em>' attribute is set.
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @generated
     */
    boolean isSetPPccControl();

    /**
     * Returns the value of the '<em><b>QPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsQpccControlKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QPcc Control</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsQpccControlKind
     * @see #isSetQPccControl()
     * @see #unsetQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_QPccControl()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.qPccControl' kind='element'"
     * @generated
     */
    VsQpccControlKind getQPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsQpccControlKind
     * @see #isSetQPccControl()
     * @see #unsetQPccControl()
     * @see #getQPccControl()
     * @generated
     */
    void setQPccControl( VsQpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQPccControl()
     * @see #getQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @generated
     */
    void unsetQPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QPcc Control</em>' attribute is set.
     * @see #unsetQPccControl()
     * @see #getQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @generated
     */
    boolean isSetQPccControl();

    /**
     * Returns the value of the '<em><b>QShare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>QShare</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>QShare</em>' attribute.
     * @see #isSetQShare()
     * @see #unsetQShare()
     * @see #setQShare(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_QShare()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.qShare' kind='element'"
     * @generated
     */
    Float getQShare();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQShare <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QShare</em>' attribute.
     * @see #isSetQShare()
     * @see #unsetQShare()
     * @see #getQShare()
     * @generated
     */
    void setQShare( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQShare <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQShare()
     * @see #getQShare()
     * @see #setQShare(Float)
     * @generated
     */
    void unsetQShare();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getQShare <em>QShare</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QShare</em>' attribute is set.
     * @see #unsetQShare()
     * @see #getQShare()
     * @see #setQShare(Float)
     * @generated
     */
    boolean isSetQShare();

    /**
     * Returns the value of the '<em><b>Target Qpcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Qpcc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Qpcc</em>' attribute.
     * @see #isSetTargetQpcc()
     * @see #unsetTargetQpcc()
     * @see #setTargetQpcc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_TargetQpcc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.targetQpcc' kind='element'"
     * @generated
     */
    Float getTargetQpcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Qpcc</em>' attribute.
     * @see #isSetTargetQpcc()
     * @see #unsetTargetQpcc()
     * @see #getTargetQpcc()
     * @generated
     */
    void setTargetQpcc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetQpcc()
     * @see #getTargetQpcc()
     * @see #setTargetQpcc(Float)
     * @generated
     */
    void unsetTargetQpcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Qpcc</em>' attribute is set.
     * @see #unsetTargetQpcc()
     * @see #getTargetQpcc()
     * @see #setTargetQpcc(Float)
     * @generated
     */
    boolean isSetTargetQpcc();

    /**
     * Returns the value of the '<em><b>Target Upcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Upcc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Upcc</em>' attribute.
     * @see #isSetTargetUpcc()
     * @see #unsetTargetUpcc()
     * @see #setTargetUpcc(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_TargetUpcc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.targetUpcc' kind='element'"
     * @generated
     */
    Float getTargetUpcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Upcc</em>' attribute.
     * @see #isSetTargetUpcc()
     * @see #unsetTargetUpcc()
     * @see #getTargetUpcc()
     * @generated
     */
    void setTargetUpcc( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetUpcc()
     * @see #getTargetUpcc()
     * @see #setTargetUpcc(Float)
     * @generated
     */
    void unsetTargetUpcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Upcc</em>' attribute is set.
     * @see #unsetTargetUpcc()
     * @see #getTargetUpcc()
     * @see #setTargetUpcc(Float)
     * @generated
     */
    boolean isSetTargetUpcc();

    /**
     * Returns the value of the '<em><b>Uv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uv</em>' attribute.
     * @see #isSetUv()
     * @see #unsetUv()
     * @see #setUv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_Uv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.uv' kind='element'"
     * @generated
     */
    Float getUv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getUv <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uv</em>' attribute.
     * @see #isSetUv()
     * @see #unsetUv()
     * @see #getUv()
     * @generated
     */
    void setUv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getUv <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUv()
     * @see #getUv()
     * @see #setUv(Float)
     * @generated
     */
    void unsetUv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getUv <em>Uv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uv</em>' attribute is set.
     * @see #unsetUv()
     * @see #getUv()
     * @see #setUv(Float)
     * @generated
     */
    boolean isSetUv();

    /**
     * Returns the value of the '<em><b>Capability Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Capability Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Capability Curve</em>' reference.
     * @see #isSetCapabilityCurve()
     * @see #unsetCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVsConverter_CapabilityCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsCapabilityCurve#getVsConverterDCSides
     * @model opposite="VsConverterDCSides" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VsConverter.CapabilityCurve' kind='element'"
     * @generated
     */
    VsCapabilityCurve getCapabilityCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Curve</em>' reference.
     * @see #isSetCapabilityCurve()
     * @see #unsetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @generated
     */
    void setCapabilityCurve( VsCapabilityCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @generated
     */
    void unsetCapabilityCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Curve</em>' reference is set.
     * @see #unsetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @generated
     */
    boolean isSetCapabilityCurve();

} // VsConverter
