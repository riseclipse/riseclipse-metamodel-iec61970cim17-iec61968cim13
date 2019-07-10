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
 * A representation of the model object '<em><b>Synchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit()
 * @model
 * @generated
 */
public interface SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed {
    /**
     * Returns the value of the '<em><b>R1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R1d</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R1d</em>' attribute.
     * @see #isSetR1d()
     * @see #unsetR1d()
     * @see #setR1d(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R1d()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.r1d' kind='element'"
     * @generated
     */
    Float getR1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R1d</em>' attribute.
     * @see #isSetR1d()
     * @see #unsetR1d()
     * @see #getR1d()
     * @generated
     */
    void setR1d( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR1d()
     * @see #getR1d()
     * @see #setR1d(Float)
     * @generated
     */
    void unsetR1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R1d</em>' attribute is set.
     * @see #unsetR1d()
     * @see #getR1d()
     * @see #setR1d(Float)
     * @generated
     */
    boolean isSetR1d();

    /**
     * Returns the value of the '<em><b>R1q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R1q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R1q</em>' attribute.
     * @see #isSetR1q()
     * @see #unsetR1q()
     * @see #setR1q(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R1q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.r1q' kind='element'"
     * @generated
     */
    Float getR1q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R1q</em>' attribute.
     * @see #isSetR1q()
     * @see #unsetR1q()
     * @see #getR1q()
     * @generated
     */
    void setR1q( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR1q()
     * @see #getR1q()
     * @see #setR1q(Float)
     * @generated
     */
    void unsetR1q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R1q</em>' attribute is set.
     * @see #unsetR1q()
     * @see #getR1q()
     * @see #setR1q(Float)
     * @generated
     */
    boolean isSetR1q();

    /**
     * Returns the value of the '<em><b>R2q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>R2q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>R2q</em>' attribute.
     * @see #isSetR2q()
     * @see #unsetR2q()
     * @see #setR2q(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R2q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.r2q' kind='element'"
     * @generated
     */
    Float getR2q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R2q</em>' attribute.
     * @see #isSetR2q()
     * @see #unsetR2q()
     * @see #getR2q()
     * @generated
     */
    void setR2q( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR2q()
     * @see #getR2q()
     * @see #setR2q(Float)
     * @generated
     */
    void unsetR2q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R2q</em>' attribute is set.
     * @see #unsetR2q()
     * @see #getR2q()
     * @see #setR2q(Float)
     * @generated
     */
    boolean isSetR2q();

    /**
     * Returns the value of the '<em><b>Rfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rfd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rfd</em>' attribute.
     * @see #isSetRfd()
     * @see #unsetRfd()
     * @see #setRfd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Rfd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.rfd' kind='element'"
     * @generated
     */
    Float getRfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rfd</em>' attribute.
     * @see #isSetRfd()
     * @see #unsetRfd()
     * @see #getRfd()
     * @generated
     */
    void setRfd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRfd()
     * @see #getRfd()
     * @see #setRfd(Float)
     * @generated
     */
    void unsetRfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rfd</em>' attribute is set.
     * @see #unsetRfd()
     * @see #getRfd()
     * @see #setRfd(Float)
     * @generated
     */
    boolean isSetRfd();

    /**
     * Returns the value of the '<em><b>X1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X1d</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X1d</em>' attribute.
     * @see #isSetX1d()
     * @see #unsetX1d()
     * @see #setX1d(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X1d()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.x1d' kind='element'"
     * @generated
     */
    Float getX1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1d</em>' attribute.
     * @see #isSetX1d()
     * @see #unsetX1d()
     * @see #getX1d()
     * @generated
     */
    void setX1d( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1d()
     * @see #getX1d()
     * @see #setX1d(Float)
     * @generated
     */
    void unsetX1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1d</em>' attribute is set.
     * @see #unsetX1d()
     * @see #getX1d()
     * @see #setX1d(Float)
     * @generated
     */
    boolean isSetX1d();

    /**
     * Returns the value of the '<em><b>X1q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X1q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X1q</em>' attribute.
     * @see #isSetX1q()
     * @see #unsetX1q()
     * @see #setX1q(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X1q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.x1q' kind='element'"
     * @generated
     */
    Float getX1q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1q</em>' attribute.
     * @see #isSetX1q()
     * @see #unsetX1q()
     * @see #getX1q()
     * @generated
     */
    void setX1q( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1q()
     * @see #getX1q()
     * @see #setX1q(Float)
     * @generated
     */
    void unsetX1q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1q</em>' attribute is set.
     * @see #unsetX1q()
     * @see #getX1q()
     * @see #setX1q(Float)
     * @generated
     */
    boolean isSetX1q();

    /**
     * Returns the value of the '<em><b>X2q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>X2q</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>X2q</em>' attribute.
     * @see #isSetX2q()
     * @see #unsetX2q()
     * @see #setX2q(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X2q()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.x2q' kind='element'"
     * @generated
     */
    Float getX2q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2q</em>' attribute.
     * @see #isSetX2q()
     * @see #unsetX2q()
     * @see #getX2q()
     * @generated
     */
    void setX2q( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2q()
     * @see #getX2q()
     * @see #setX2q(Float)
     * @generated
     */
    void unsetX2q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2q</em>' attribute is set.
     * @see #unsetX2q()
     * @see #getX2q()
     * @see #setX2q(Float)
     * @generated
     */
    boolean isSetX2q();

    /**
     * Returns the value of the '<em><b>Xad</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xad</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xad</em>' attribute.
     * @see #isSetXad()
     * @see #unsetXad()
     * @see #setXad(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xad()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.xad' kind='element'"
     * @generated
     */
    Float getXad();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xad</em>' attribute.
     * @see #isSetXad()
     * @see #unsetXad()
     * @see #getXad()
     * @generated
     */
    void setXad( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXad()
     * @see #getXad()
     * @see #setXad(Float)
     * @generated
     */
    void unsetXad();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xad</em>' attribute is set.
     * @see #unsetXad()
     * @see #getXad()
     * @see #setXad(Float)
     * @generated
     */
    boolean isSetXad();

    /**
     * Returns the value of the '<em><b>Xaq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xaq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xaq</em>' attribute.
     * @see #isSetXaq()
     * @see #unsetXaq()
     * @see #setXaq(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xaq()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.xaq' kind='element'"
     * @generated
     */
    Float getXaq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xaq</em>' attribute.
     * @see #isSetXaq()
     * @see #unsetXaq()
     * @see #getXaq()
     * @generated
     */
    void setXaq( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXaq()
     * @see #getXaq()
     * @see #setXaq(Float)
     * @generated
     */
    void unsetXaq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xaq</em>' attribute is set.
     * @see #unsetXaq()
     * @see #getXaq()
     * @see #setXaq(Float)
     * @generated
     */
    boolean isSetXaq();

    /**
     * Returns the value of the '<em><b>Xf1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xf1d</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xf1d</em>' attribute.
     * @see #isSetXf1d()
     * @see #unsetXf1d()
     * @see #setXf1d(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xf1d()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.xf1d' kind='element'"
     * @generated
     */
    Float getXf1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xf1d</em>' attribute.
     * @see #isSetXf1d()
     * @see #unsetXf1d()
     * @see #getXf1d()
     * @generated
     */
    void setXf1d( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXf1d()
     * @see #getXf1d()
     * @see #setXf1d(Float)
     * @generated
     */
    void unsetXf1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xf1d</em>' attribute is set.
     * @see #unsetXf1d()
     * @see #getXf1d()
     * @see #setXf1d(Float)
     * @generated
     */
    boolean isSetXf1d();

    /**
     * Returns the value of the '<em><b>Xfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xfd</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xfd</em>' attribute.
     * @see #isSetXfd()
     * @see #unsetXfd()
     * @see #setXfd(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xfd()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SynchronousMachineEquivalentCircuit.xfd' kind='element'"
     * @generated
     */
    Float getXfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xfd</em>' attribute.
     * @see #isSetXfd()
     * @see #unsetXfd()
     * @see #getXfd()
     * @generated
     */
    void setXfd( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXfd()
     * @see #getXfd()
     * @see #setXfd(Float)
     * @generated
     */
    void unsetXfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xfd</em>' attribute is set.
     * @see #unsetXfd()
     * @see #getXfd()
     * @see #setXfd(Float)
     * @generated
     */
    boolean isSetXfd();

} // SynchronousMachineEquivalentCircuit
