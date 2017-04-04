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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral <em>Address General</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getCode <em>Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail()
 * @model
 * @generated
 */
public interface StreetDetail extends EObject {
    /**
     * Returns the value of the '<em><b>Address General</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address General</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address General</em>' attribute.
     * @see #isSetAddressGeneral()
     * @see #unsetAddressGeneral()
     * @see #setAddressGeneral(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_AddressGeneral()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.addressGeneral' kind='element'"
     * @generated
     */
    String getAddressGeneral();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General</em>' attribute.
     * @see #isSetAddressGeneral()
     * @see #unsetAddressGeneral()
     * @see #getAddressGeneral()
     * @generated
     */
    void setAddressGeneral( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral()
     * @see #getAddressGeneral()
     * @see #setAddressGeneral(String)
     * @generated
     */
    void unsetAddressGeneral();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral <em>Address General</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General</em>' attribute is set.
     * @see #unsetAddressGeneral()
     * @see #getAddressGeneral()
     * @see #setAddressGeneral(String)
     * @generated
     */
    boolean isSetAddressGeneral();

    /**
     * Returns the value of the '<em><b>Address General2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address General2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address General2</em>' attribute.
     * @see #isSetAddressGeneral2()
     * @see #unsetAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_AddressGeneral2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.addressGeneral2' kind='element'"
     * @generated
     */
    String getAddressGeneral2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General2</em>' attribute.
     * @see #isSetAddressGeneral2()
     * @see #unsetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @generated
     */
    void setAddressGeneral2( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @generated
     */
    void unsetAddressGeneral2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral2 <em>Address General2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General2</em>' attribute is set.
     * @see #unsetAddressGeneral2()
     * @see #getAddressGeneral2()
     * @see #setAddressGeneral2(String)
     * @generated
     */
    boolean isSetAddressGeneral2();

    /**
     * Returns the value of the '<em><b>Address General3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address General3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Address General3</em>' attribute.
     * @see #isSetAddressGeneral3()
     * @see #unsetAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_AddressGeneral3()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.addressGeneral3' kind='element'"
     * @generated
     */
    String getAddressGeneral3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Address General3</em>' attribute.
     * @see #isSetAddressGeneral3()
     * @see #unsetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @generated
     */
    void setAddressGeneral3( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @generated
     */
    void unsetAddressGeneral3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getAddressGeneral3 <em>Address General3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Address General3</em>' attribute is set.
     * @see #unsetAddressGeneral3()
     * @see #getAddressGeneral3()
     * @see #setAddressGeneral3(String)
     * @generated
     */
    boolean isSetAddressGeneral3();

    /**
     * Returns the value of the '<em><b>Building Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Building Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #setBuildingName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_BuildingName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.buildingName' kind='element'"
     * @generated
     */
    String getBuildingName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Building Name</em>' attribute.
     * @see #isSetBuildingName()
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @generated
     */
    void setBuildingName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    void unsetBuildingName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getBuildingName <em>Building Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Building Name</em>' attribute is set.
     * @see #unsetBuildingName()
     * @see #getBuildingName()
     * @see #setBuildingName(String)
     * @generated
     */
    boolean isSetBuildingName();

    /**
     * Returns the value of the '<em><b>Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #setCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Code()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.code' kind='element'"
     * @generated
     */
    String getCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' attribute.
     * @see #isSetCode()
     * @see #unsetCode()
     * @see #getCode()
     * @generated
     */
    void setCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getCode <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    void unsetCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getCode <em>Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Code</em>' attribute is set.
     * @see #unsetCode()
     * @see #getCode()
     * @see #setCode(String)
     * @generated
     */
    boolean isSetCode();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Name()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.name' kind='element'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Number</em>' attribute.
     * @see #isSetNumber()
     * @see #unsetNumber()
     * @see #setNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Number()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.number' kind='element'"
     * @generated
     */
    String getNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Number</em>' attribute.
     * @see #isSetNumber()
     * @see #unsetNumber()
     * @see #getNumber()
     * @generated
     */
    void setNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNumber()
     * @see #getNumber()
     * @see #setNumber(String)
     * @generated
     */
    void unsetNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getNumber <em>Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Number</em>' attribute is set.
     * @see #unsetNumber()
     * @see #getNumber()
     * @see #setNumber(String)
     * @generated
     */
    boolean isSetNumber();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Prefix()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.prefix' kind='element'"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #setSuffix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Suffix()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.suffix' kind='element'"
     * @generated
     */
    String getSuffix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @generated
     */
    void setSuffix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    void unsetSuffix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuffix <em>Suffix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suffix</em>' attribute is set.
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    boolean isSetSuffix();

    /**
     * Returns the value of the '<em><b>Suite Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suite Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suite Number</em>' attribute.
     * @see #isSetSuiteNumber()
     * @see #unsetSuiteNumber()
     * @see #setSuiteNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_SuiteNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.suiteNumber' kind='element'"
     * @generated
     */
    String getSuiteNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suite Number</em>' attribute.
     * @see #isSetSuiteNumber()
     * @see #unsetSuiteNumber()
     * @see #getSuiteNumber()
     * @generated
     */
    void setSuiteNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuiteNumber()
     * @see #getSuiteNumber()
     * @see #setSuiteNumber(String)
     * @generated
     */
    void unsetSuiteNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getSuiteNumber <em>Suite Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suite Number</em>' attribute is set.
     * @see #unsetSuiteNumber()
     * @see #getSuiteNumber()
     * @see #setSuiteNumber(String)
     * @generated
     */
    boolean isSetSuiteNumber();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_Type()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.type' kind='element'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Within Town Limits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Within Town Limits</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Within Town Limits</em>' attribute.
     * @see #isSetWithinTownLimits()
     * @see #unsetWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStreetDetail_WithinTownLimits()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StreetDetail.withinTownLimits' kind='element'"
     * @generated
     */
    Boolean getWithinTownLimits();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Within Town Limits</em>' attribute.
     * @see #isSetWithinTownLimits()
     * @see #unsetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @generated
     */
    void setWithinTownLimits( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @generated
     */
    void unsetWithinTownLimits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StreetDetail#getWithinTownLimits <em>Within Town Limits</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Within Town Limits</em>' attribute is set.
     * @see #unsetWithinTownLimits()
     * @see #getWithinTownLimits()
     * @see #setWithinTownLimits(Boolean)
     * @generated
     */
    boolean isSetWithinTownLimits();

} // StreetDetail
