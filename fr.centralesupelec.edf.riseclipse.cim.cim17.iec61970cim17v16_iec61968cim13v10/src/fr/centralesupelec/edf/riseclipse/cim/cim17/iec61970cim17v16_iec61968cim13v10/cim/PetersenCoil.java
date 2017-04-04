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
 * A representation of the model object '<em><b>Petersen Coil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getNominalU <em>Nominal U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil()
 * @model
 * @generated
 */
public interface PetersenCoil extends EarthFaultCompensator {
    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoilModeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoilModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(PetersenCoilModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_Mode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.mode' kind='element'"
     * @generated
     */
    PetersenCoilModeKind getMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoilModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode( PetersenCoilModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(PetersenCoilModeKind)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(PetersenCoilModeKind)
     * @generated
     */
    boolean isSetMode();

    /**
     * Returns the value of the '<em><b>Nominal U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal U</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal U</em>' attribute.
     * @see #isSetNominalU()
     * @see #unsetNominalU()
     * @see #setNominalU(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_NominalU()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.nominalU' kind='element'"
     * @generated
     */
    Float getNominalU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal U</em>' attribute.
     * @see #isSetNominalU()
     * @see #unsetNominalU()
     * @see #getNominalU()
     * @generated
     */
    void setNominalU( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalU()
     * @see #getNominalU()
     * @see #setNominalU(Float)
     * @generated
     */
    void unsetNominalU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal U</em>' attribute is set.
     * @see #unsetNominalU()
     * @see #getNominalU()
     * @see #setNominalU(Float)
     * @generated
     */
    boolean isSetNominalU();

    /**
     * Returns the value of the '<em><b>Offset Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset Current</em>' attribute.
     * @see #isSetOffsetCurrent()
     * @see #unsetOffsetCurrent()
     * @see #setOffsetCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_OffsetCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.offsetCurrent' kind='element'"
     * @generated
     */
    Float getOffsetCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Current</em>' attribute.
     * @see #isSetOffsetCurrent()
     * @see #unsetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @generated
     */
    void setOffsetCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @see #setOffsetCurrent(Float)
     * @generated
     */
    void unsetOffsetCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Current</em>' attribute is set.
     * @see #unsetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @see #setOffsetCurrent(Float)
     * @generated
     */
    boolean isSetOffsetCurrent();

    /**
     * Returns the value of the '<em><b>Position Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position Current</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position Current</em>' attribute.
     * @see #isSetPositionCurrent()
     * @see #unsetPositionCurrent()
     * @see #setPositionCurrent(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_PositionCurrent()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.positionCurrent' kind='element'"
     * @generated
     */
    Float getPositionCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position Current</em>' attribute.
     * @see #isSetPositionCurrent()
     * @see #unsetPositionCurrent()
     * @see #getPositionCurrent()
     * @generated
     */
    void setPositionCurrent( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositionCurrent()
     * @see #getPositionCurrent()
     * @see #setPositionCurrent(Float)
     * @generated
     */
    void unsetPositionCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position Current</em>' attribute is set.
     * @see #unsetPositionCurrent()
     * @see #getPositionCurrent()
     * @see #setPositionCurrent(Float)
     * @generated
     */
    boolean isSetPositionCurrent();

    /**
     * Returns the value of the '<em><b>XGround Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XGround Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XGround Max</em>' attribute.
     * @see #isSetXGroundMax()
     * @see #unsetXGroundMax()
     * @see #setXGroundMax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_XGroundMax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.xGroundMax' kind='element'"
     * @generated
     */
    Float getXGroundMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Max</em>' attribute.
     * @see #isSetXGroundMax()
     * @see #unsetXGroundMax()
     * @see #getXGroundMax()
     * @generated
     */
    void setXGroundMax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundMax()
     * @see #getXGroundMax()
     * @see #setXGroundMax(Float)
     * @generated
     */
    void unsetXGroundMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Max</em>' attribute is set.
     * @see #unsetXGroundMax()
     * @see #getXGroundMax()
     * @see #setXGroundMax(Float)
     * @generated
     */
    boolean isSetXGroundMax();

    /**
     * Returns the value of the '<em><b>XGround Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XGround Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XGround Min</em>' attribute.
     * @see #isSetXGroundMin()
     * @see #unsetXGroundMin()
     * @see #setXGroundMin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_XGroundMin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.xGroundMin' kind='element'"
     * @generated
     */
    Float getXGroundMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Min</em>' attribute.
     * @see #isSetXGroundMin()
     * @see #unsetXGroundMin()
     * @see #getXGroundMin()
     * @generated
     */
    void setXGroundMin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundMin()
     * @see #getXGroundMin()
     * @see #setXGroundMin(Float)
     * @generated
     */
    void unsetXGroundMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Min</em>' attribute is set.
     * @see #unsetXGroundMin()
     * @see #getXGroundMin()
     * @see #setXGroundMin(Float)
     * @generated
     */
    boolean isSetXGroundMin();

    /**
     * Returns the value of the '<em><b>XGround Nominal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XGround Nominal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XGround Nominal</em>' attribute.
     * @see #isSetXGroundNominal()
     * @see #unsetXGroundNominal()
     * @see #setXGroundNominal(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPetersenCoil_XGroundNominal()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PetersenCoil.xGroundNominal' kind='element'"
     * @generated
     */
    Float getXGroundNominal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Nominal</em>' attribute.
     * @see #isSetXGroundNominal()
     * @see #unsetXGroundNominal()
     * @see #getXGroundNominal()
     * @generated
     */
    void setXGroundNominal( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundNominal()
     * @see #getXGroundNominal()
     * @see #setXGroundNominal(Float)
     * @generated
     */
    void unsetXGroundNominal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Nominal</em>' attribute is set.
     * @see #unsetXGroundNominal()
     * @see #getXGroundNominal()
     * @see #setXGroundNominal(Float)
     * @generated
     */
    boolean isSetXGroundNominal();

} // PetersenCoil
