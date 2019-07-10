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
 * A representation of the model object '<em><b>ISO Upper Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeInvoke <em>Ae Invoke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeQual <em>Ae Qual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApInvoke <em>Ap Invoke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApTitle <em>Ap Title</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiPsel <em>Osi Psel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiSsel <em>Osi Ssel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiTsel <em>Osi Tsel</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer()
 * @model
 * @generated
 */
public interface ISOUpperLayer extends TCPAccessPoint {
    /**
     * Returns the value of the '<em><b>Ae Invoke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ae Invoke</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ae Invoke</em>' attribute.
     * @see #isSetAeInvoke()
     * @see #unsetAeInvoke()
     * @see #setAeInvoke(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_AeInvoke()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.aeInvoke' kind='element'"
     * @generated
     */
    Integer getAeInvoke();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeInvoke <em>Ae Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ae Invoke</em>' attribute.
     * @see #isSetAeInvoke()
     * @see #unsetAeInvoke()
     * @see #getAeInvoke()
     * @generated
     */
    void setAeInvoke( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeInvoke <em>Ae Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAeInvoke()
     * @see #getAeInvoke()
     * @see #setAeInvoke(Integer)
     * @generated
     */
    void unsetAeInvoke();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeInvoke <em>Ae Invoke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ae Invoke</em>' attribute is set.
     * @see #unsetAeInvoke()
     * @see #getAeInvoke()
     * @see #setAeInvoke(Integer)
     * @generated
     */
    boolean isSetAeInvoke();

    /**
     * Returns the value of the '<em><b>Ae Qual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ae Qual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ae Qual</em>' attribute.
     * @see #isSetAeQual()
     * @see #unsetAeQual()
     * @see #setAeQual(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_AeQual()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.aeQual' kind='element'"
     * @generated
     */
    Integer getAeQual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeQual <em>Ae Qual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ae Qual</em>' attribute.
     * @see #isSetAeQual()
     * @see #unsetAeQual()
     * @see #getAeQual()
     * @generated
     */
    void setAeQual( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeQual <em>Ae Qual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAeQual()
     * @see #getAeQual()
     * @see #setAeQual(Integer)
     * @generated
     */
    void unsetAeQual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getAeQual <em>Ae Qual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ae Qual</em>' attribute is set.
     * @see #unsetAeQual()
     * @see #getAeQual()
     * @see #setAeQual(Integer)
     * @generated
     */
    boolean isSetAeQual();

    /**
     * Returns the value of the '<em><b>Ap Invoke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ap Invoke</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Invoke</em>' attribute.
     * @see #isSetApInvoke()
     * @see #unsetApInvoke()
     * @see #setApInvoke(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_ApInvoke()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.apInvoke' kind='element'"
     * @generated
     */
    Integer getApInvoke();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApInvoke <em>Ap Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Invoke</em>' attribute.
     * @see #isSetApInvoke()
     * @see #unsetApInvoke()
     * @see #getApInvoke()
     * @generated
     */
    void setApInvoke( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApInvoke <em>Ap Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApInvoke()
     * @see #getApInvoke()
     * @see #setApInvoke(Integer)
     * @generated
     */
    void unsetApInvoke();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApInvoke <em>Ap Invoke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Invoke</em>' attribute is set.
     * @see #unsetApInvoke()
     * @see #getApInvoke()
     * @see #setApInvoke(Integer)
     * @generated
     */
    boolean isSetApInvoke();

    /**
     * Returns the value of the '<em><b>Ap Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ap Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Title</em>' attribute.
     * @see #isSetApTitle()
     * @see #unsetApTitle()
     * @see #setApTitle(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_ApTitle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.apTitle' kind='element'"
     * @generated
     */
    String getApTitle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApTitle <em>Ap Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Title</em>' attribute.
     * @see #isSetApTitle()
     * @see #unsetApTitle()
     * @see #getApTitle()
     * @generated
     */
    void setApTitle( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApTitle <em>Ap Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApTitle()
     * @see #getApTitle()
     * @see #setApTitle(String)
     * @generated
     */
    void unsetApTitle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getApTitle <em>Ap Title</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Title</em>' attribute is set.
     * @see #unsetApTitle()
     * @see #getApTitle()
     * @see #setApTitle(String)
     * @generated
     */
    boolean isSetApTitle();

    /**
     * Returns the value of the '<em><b>Osi Psel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Osi Psel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Osi Psel</em>' attribute.
     * @see #isSetOsiPsel()
     * @see #unsetOsiPsel()
     * @see #setOsiPsel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_OsiPsel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.osiPsel' kind='element'"
     * @generated
     */
    String getOsiPsel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiPsel <em>Osi Psel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Osi Psel</em>' attribute.
     * @see #isSetOsiPsel()
     * @see #unsetOsiPsel()
     * @see #getOsiPsel()
     * @generated
     */
    void setOsiPsel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiPsel <em>Osi Psel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOsiPsel()
     * @see #getOsiPsel()
     * @see #setOsiPsel(String)
     * @generated
     */
    void unsetOsiPsel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiPsel <em>Osi Psel</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Osi Psel</em>' attribute is set.
     * @see #unsetOsiPsel()
     * @see #getOsiPsel()
     * @see #setOsiPsel(String)
     * @generated
     */
    boolean isSetOsiPsel();

    /**
     * Returns the value of the '<em><b>Osi Ssel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Osi Ssel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Osi Ssel</em>' attribute.
     * @see #isSetOsiSsel()
     * @see #unsetOsiSsel()
     * @see #setOsiSsel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_OsiSsel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.osiSsel' kind='element'"
     * @generated
     */
    String getOsiSsel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiSsel <em>Osi Ssel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Osi Ssel</em>' attribute.
     * @see #isSetOsiSsel()
     * @see #unsetOsiSsel()
     * @see #getOsiSsel()
     * @generated
     */
    void setOsiSsel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiSsel <em>Osi Ssel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOsiSsel()
     * @see #getOsiSsel()
     * @see #setOsiSsel(String)
     * @generated
     */
    void unsetOsiSsel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiSsel <em>Osi Ssel</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Osi Ssel</em>' attribute is set.
     * @see #unsetOsiSsel()
     * @see #getOsiSsel()
     * @see #setOsiSsel(String)
     * @generated
     */
    boolean isSetOsiSsel();

    /**
     * Returns the value of the '<em><b>Osi Tsel</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Osi Tsel</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Osi Tsel</em>' attribute.
     * @see #isSetOsiTsel()
     * @see #unsetOsiTsel()
     * @see #setOsiTsel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getISOUpperLayer_OsiTsel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ISOUpperLayer.osiTsel' kind='element'"
     * @generated
     */
    String getOsiTsel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiTsel <em>Osi Tsel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Osi Tsel</em>' attribute.
     * @see #isSetOsiTsel()
     * @see #unsetOsiTsel()
     * @see #getOsiTsel()
     * @generated
     */
    void setOsiTsel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiTsel <em>Osi Tsel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOsiTsel()
     * @see #getOsiTsel()
     * @see #setOsiTsel(String)
     * @generated
     */
    void unsetOsiTsel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer#getOsiTsel <em>Osi Tsel</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Osi Tsel</em>' attribute is set.
     * @see #unsetOsiTsel()
     * @see #getOsiTsel()
     * @see #setOsiTsel(String)
     * @generated
     */
    boolean isSetOsiTsel();

} // ISOUpperLayer
