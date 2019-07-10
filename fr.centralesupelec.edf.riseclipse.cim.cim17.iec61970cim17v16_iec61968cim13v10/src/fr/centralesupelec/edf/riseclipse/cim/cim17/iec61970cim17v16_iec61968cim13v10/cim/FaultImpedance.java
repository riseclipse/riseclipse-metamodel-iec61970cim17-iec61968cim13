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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fault Impedance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRGround <em>RGround</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRLineToLine <em>RLine To Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXGround <em>XGround</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXLineToLine <em>XLine To Line</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFaultImpedance()
 * @model
 * @generated
 */
public interface FaultImpedance extends EObject {
    /**
     * Returns the value of the '<em><b>RGround</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RGround</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RGround</em>' attribute.
     * @see #isSetRGround()
     * @see #unsetRGround()
     * @see #setRGround(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFaultImpedance_RGround()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FaultImpedance.rGround' kind='element'"
     * @generated
     */
    Float getRGround();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRGround <em>RGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RGround</em>' attribute.
     * @see #isSetRGround()
     * @see #unsetRGround()
     * @see #getRGround()
     * @generated
     */
    void setRGround( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRGround <em>RGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRGround()
     * @see #getRGround()
     * @see #setRGround(Float)
     * @generated
     */
    void unsetRGround();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRGround <em>RGround</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RGround</em>' attribute is set.
     * @see #unsetRGround()
     * @see #getRGround()
     * @see #setRGround(Float)
     * @generated
     */
    boolean isSetRGround();

    /**
     * Returns the value of the '<em><b>RLine To Line</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>RLine To Line</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>RLine To Line</em>' attribute.
     * @see #isSetRLineToLine()
     * @see #unsetRLineToLine()
     * @see #setRLineToLine(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFaultImpedance_RLineToLine()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FaultImpedance.rLineToLine' kind='element'"
     * @generated
     */
    Float getRLineToLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRLineToLine <em>RLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>RLine To Line</em>' attribute.
     * @see #isSetRLineToLine()
     * @see #unsetRLineToLine()
     * @see #getRLineToLine()
     * @generated
     */
    void setRLineToLine( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRLineToLine <em>RLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRLineToLine()
     * @see #getRLineToLine()
     * @see #setRLineToLine(Float)
     * @generated
     */
    void unsetRLineToLine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getRLineToLine <em>RLine To Line</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>RLine To Line</em>' attribute is set.
     * @see #unsetRLineToLine()
     * @see #getRLineToLine()
     * @see #setRLineToLine(Float)
     * @generated
     */
    boolean isSetRLineToLine();

    /**
     * Returns the value of the '<em><b>XGround</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XGround</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XGround</em>' attribute.
     * @see #isSetXGround()
     * @see #unsetXGround()
     * @see #setXGround(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFaultImpedance_XGround()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FaultImpedance.xGround' kind='element'"
     * @generated
     */
    Float getXGround();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXGround <em>XGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround</em>' attribute.
     * @see #isSetXGround()
     * @see #unsetXGround()
     * @see #getXGround()
     * @generated
     */
    void setXGround( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXGround <em>XGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGround()
     * @see #getXGround()
     * @see #setXGround(Float)
     * @generated
     */
    void unsetXGround();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXGround <em>XGround</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround</em>' attribute is set.
     * @see #unsetXGround()
     * @see #getXGround()
     * @see #setXGround(Float)
     * @generated
     */
    boolean isSetXGround();

    /**
     * Returns the value of the '<em><b>XLine To Line</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XLine To Line</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XLine To Line</em>' attribute.
     * @see #isSetXLineToLine()
     * @see #unsetXLineToLine()
     * @see #setXLineToLine(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFaultImpedance_XLineToLine()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FaultImpedance.xLineToLine' kind='element'"
     * @generated
     */
    Float getXLineToLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXLineToLine <em>XLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XLine To Line</em>' attribute.
     * @see #isSetXLineToLine()
     * @see #unsetXLineToLine()
     * @see #getXLineToLine()
     * @generated
     */
    void setXLineToLine( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXLineToLine <em>XLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXLineToLine()
     * @see #getXLineToLine()
     * @see #setXLineToLine(Float)
     * @generated
     */
    void unsetXLineToLine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance#getXLineToLine <em>XLine To Line</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XLine To Line</em>' attribute is set.
     * @see #unsetXLineToLine()
     * @see #getXLineToLine()
     * @see #setXLineToLine(Float)
     * @generated
     */
    boolean isSetXLineToLine();

} // FaultImpedance
