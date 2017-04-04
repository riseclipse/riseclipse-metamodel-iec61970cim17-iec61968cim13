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
 * A representation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getShare <em>Share</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAssetOwner <em>Asset Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Share</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Share</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Share</em>' attribute.
     * @see #isSetShare()
     * @see #unsetShare()
     * @see #setShare(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOwnership_Share()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Ownership.share' kind='element'"
     * @generated
     */
    Float getShare();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getShare <em>Share</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Share</em>' attribute.
     * @see #isSetShare()
     * @see #unsetShare()
     * @see #getShare()
     * @generated
     */
    void setShare( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getShare <em>Share</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShare()
     * @see #getShare()
     * @see #setShare(Float)
     * @generated
     */
    void unsetShare();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getShare <em>Share</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Share</em>' attribute is set.
     * @see #unsetShare()
     * @see #getShare()
     * @see #setShare(Float)
     * @generated
     */
    boolean isSetShare();

    /**
     * Returns the value of the '<em><b>Asset Owner</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOwner#getOwnerships <em>Ownerships</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Owner</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Owner</em>' reference.
     * @see #isSetAssetOwner()
     * @see #unsetAssetOwner()
     * @see #setAssetOwner(AssetOwner)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOwnership_AssetOwner()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetOwner#getOwnerships
     * @model opposite="Ownerships" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Ownership.AssetOwner' kind='element'"
     * @generated
     */
    AssetOwner getAssetOwner();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAssetOwner <em>Asset Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Owner</em>' reference.
     * @see #isSetAssetOwner()
     * @see #unsetAssetOwner()
     * @see #getAssetOwner()
     * @generated
     */
    void setAssetOwner( AssetOwner value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAssetOwner <em>Asset Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetOwner()
     * @see #getAssetOwner()
     * @see #setAssetOwner(AssetOwner)
     * @generated
     */
    void unsetAssetOwner();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAssetOwner <em>Asset Owner</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Owner</em>' reference is set.
     * @see #unsetAssetOwner()
     * @see #getAssetOwner()
     * @see #setAssetOwner(AssetOwner)
     * @generated
     */
    boolean isSetAssetOwner();

    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOwnerships <em>Ownerships</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #setAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOwnership_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getOwnerships
     * @model opposite="Ownerships" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Ownership.Asset' kind='element'"
     * @generated
     */
    Asset getAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    void setAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Ownership#getAsset <em>Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    boolean isSetAsset();

} // Ownership
