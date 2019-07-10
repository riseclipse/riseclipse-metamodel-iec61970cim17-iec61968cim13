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
 * A representation of the model object '<em><b>IP Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddress <em>Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getGateway <em>Gateway</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getSubnet <em>Subnet</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIPAccessPoint()
 * @model
 * @generated
 */
public interface IPAccessPoint extends CommunicationLink {
    /**
     * Returns the value of the '<em><b>Address</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address</em>' attribute.
     * @see #isSetAddress()
     * @see #unsetAddress()
     * @see #setAddress(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIPAccessPoint_Address()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IPAccessPoint.address' kind='element'"
     * @generated
     */
    String getAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address</em>' attribute.
     * @see #isSetAddress()
     * @see #unsetAddress()
     * @see #getAddress()
     * @generated
     */
    void setAddress( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddress <em>Address</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddress()
     * @see #getAddress()
     * @see #setAddress(String)
     * @generated
     */
    void unsetAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddress <em>Address</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address</em>' attribute is set.
     * @see #unsetAddress()
     * @see #getAddress()
     * @see #setAddress(String)
     * @generated
     */
    boolean isSetAddress();

    /**
     * Returns the value of the '<em><b>Address Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAddressKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAddressKind
     * @see #isSetAddressType()
     * @see #unsetAddressType()
     * @see #setAddressType(IPAddressKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIPAccessPoint_AddressType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IPAccessPoint.addressType' kind='element'"
     * @generated
     */
    IPAddressKind getAddressType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddressType <em>Address Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAddressKind
     * @see #isSetAddressType()
     * @see #unsetAddressType()
     * @see #getAddressType()
     * @generated
     */
    void setAddressType( IPAddressKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddressType <em>Address Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressType()
     * @see #getAddressType()
     * @see #setAddressType(IPAddressKind)
     * @generated
     */
    void unsetAddressType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getAddressType <em>Address Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address Type</em>' attribute is set.
     * @see #unsetAddressType()
     * @see #getAddressType()
     * @see #setAddressType(IPAddressKind)
     * @generated
     */
    boolean isSetAddressType();

    /**
     * Returns the value of the '<em><b>Gateway</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gateway</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gateway</em>' attribute.
     * @see #isSetGateway()
     * @see #unsetGateway()
     * @see #setGateway(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIPAccessPoint_Gateway()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IPAccessPoint.gateway' kind='element'"
     * @generated
     */
    String getGateway();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getGateway <em>Gateway</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gateway</em>' attribute.
     * @see #isSetGateway()
     * @see #unsetGateway()
     * @see #getGateway()
     * @generated
     */
    void setGateway( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getGateway <em>Gateway</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGateway()
     * @see #getGateway()
     * @see #setGateway(String)
     * @generated
     */
    void unsetGateway();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getGateway <em>Gateway</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gateway</em>' attribute is set.
     * @see #unsetGateway()
     * @see #getGateway()
     * @see #setGateway(String)
     * @generated
     */
    boolean isSetGateway();

    /**
     * Returns the value of the '<em><b>Subnet</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subnet</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subnet</em>' attribute.
     * @see #isSetSubnet()
     * @see #unsetSubnet()
     * @see #setSubnet(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getIPAccessPoint_Subnet()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='IPAccessPoint.subnet' kind='element'"
     * @generated
     */
    String getSubnet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getSubnet <em>Subnet</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subnet</em>' attribute.
     * @see #isSetSubnet()
     * @see #unsetSubnet()
     * @see #getSubnet()
     * @generated
     */
    void setSubnet( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getSubnet <em>Subnet</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubnet()
     * @see #getSubnet()
     * @see #setSubnet(String)
     * @generated
     */
    void unsetSubnet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IPAccessPoint#getSubnet <em>Subnet</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subnet</em>' attribute is set.
     * @see #unsetSubnet()
     * @see #getSubnet()
     * @see #setSubnet(String)
     * @generated
     */
    boolean isSetSubnet();

} // IPAccessPoint
