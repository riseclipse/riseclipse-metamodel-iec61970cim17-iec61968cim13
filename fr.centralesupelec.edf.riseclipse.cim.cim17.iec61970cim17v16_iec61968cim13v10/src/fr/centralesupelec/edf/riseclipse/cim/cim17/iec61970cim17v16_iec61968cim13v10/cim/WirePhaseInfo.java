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
 * A representation of the model object '<em><b>Wire Phase Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getPhaseInfo <em>Phase Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo <em>Wire Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireAssemblyInfo <em>Wire Assembly Info</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition <em>Wire Position</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePhaseInfo()
 * @model
 * @generated
 */
public interface WirePhaseInfo extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Phase Info</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Info</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Info</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseInfo()
     * @see #unsetPhaseInfo()
     * @see #setPhaseInfo(SinglePhaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePhaseInfo_PhaseInfo()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePhaseInfo.phaseInfo' kind='element'"
     * @generated
     */
    SinglePhaseKind getPhaseInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getPhaseInfo <em>Phase Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Info</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind
     * @see #isSetPhaseInfo()
     * @see #unsetPhaseInfo()
     * @see #getPhaseInfo()
     * @generated
     */
    void setPhaseInfo( SinglePhaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getPhaseInfo <em>Phase Info</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseInfo()
     * @see #getPhaseInfo()
     * @see #setPhaseInfo(SinglePhaseKind)
     * @generated
     */
    void unsetPhaseInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getPhaseInfo <em>Phase Info</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Info</em>' attribute is set.
     * @see #unsetPhaseInfo()
     * @see #getPhaseInfo()
     * @see #setPhaseInfo(SinglePhaseKind)
     * @generated
     */
    boolean isSetPhaseInfo();

    /**
     * Returns the value of the '<em><b>Wire Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getWirePhaseInfo <em>Wire Phase Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Info</em>' reference.
     * @see #isSetWireInfo()
     * @see #unsetWireInfo()
     * @see #setWireInfo(WireInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePhaseInfo_WireInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo#getWirePhaseInfo
     * @model opposite="WirePhaseInfo" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePhaseInfo.WireInfo' kind='element'"
     * @generated
     */
    WireInfo getWireInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo <em>Wire Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Info</em>' reference.
     * @see #isSetWireInfo()
     * @see #unsetWireInfo()
     * @see #getWireInfo()
     * @generated
     */
    void setWireInfo( WireInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo <em>Wire Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireInfo()
     * @see #getWireInfo()
     * @see #setWireInfo(WireInfo)
     * @generated
     */
    void unsetWireInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireInfo <em>Wire Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Info</em>' reference is set.
     * @see #unsetWireInfo()
     * @see #getWireInfo()
     * @see #setWireInfo(WireInfo)
     * @generated
     */
    boolean isSetWireInfo();

    /**
     * Returns the value of the '<em><b>Wire Assembly Info</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo#getWirePhaseInfo <em>Wire Phase Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Assembly Info</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Assembly Info</em>' reference.
     * @see #isSetWireAssemblyInfo()
     * @see #unsetWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePhaseInfo_WireAssemblyInfo()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireAssemblyInfo#getWirePhaseInfo
     * @model opposite="WirePhaseInfo" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePhaseInfo.WireAssemblyInfo' kind='element'"
     * @generated
     */
    WireAssemblyInfo getWireAssemblyInfo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Assembly Info</em>' reference.
     * @see #isSetWireAssemblyInfo()
     * @see #unsetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @generated
     */
    void setWireAssemblyInfo( WireAssemblyInfo value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @generated
     */
    void unsetWireAssemblyInfo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWireAssemblyInfo <em>Wire Assembly Info</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Assembly Info</em>' reference is set.
     * @see #unsetWireAssemblyInfo()
     * @see #getWireAssemblyInfo()
     * @see #setWireAssemblyInfo(WireAssemblyInfo)
     * @generated
     */
    boolean isSetWireAssemblyInfo();

    /**
     * Returns the value of the '<em><b>Wire Position</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWirePhaseInfo <em>Wire Phase Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Position</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Position</em>' reference.
     * @see #isSetWirePosition()
     * @see #unsetWirePosition()
     * @see #setWirePosition(WirePosition)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWirePhaseInfo_WirePosition()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWirePhaseInfo
     * @model opposite="WirePhaseInfo" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WirePhaseInfo.WirePosition' kind='element'"
     * @generated
     */
    WirePosition getWirePosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition <em>Wire Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wire Position</em>' reference.
     * @see #isSetWirePosition()
     * @see #unsetWirePosition()
     * @see #getWirePosition()
     * @generated
     */
    void setWirePosition( WirePosition value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition <em>Wire Position</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWirePosition()
     * @see #getWirePosition()
     * @see #setWirePosition(WirePosition)
     * @generated
     */
    void unsetWirePosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo#getWirePosition <em>Wire Position</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Position</em>' reference is set.
     * @see #unsetWirePosition()
     * @see #getWirePosition()
     * @see #setWirePosition(WirePosition)
     * @generated
     */
    boolean isSetWirePosition();

} // WirePhaseInfo
