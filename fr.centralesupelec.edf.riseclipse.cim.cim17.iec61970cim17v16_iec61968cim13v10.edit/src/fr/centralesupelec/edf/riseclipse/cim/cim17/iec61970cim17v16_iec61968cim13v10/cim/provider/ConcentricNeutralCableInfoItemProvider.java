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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConcentricNeutralCableInfo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcentricNeutralCableInfoItemProvider extends CableInfoItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcentricNeutralCableInfoItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addDiameterOverNeutralPropertyDescriptor( object );
            addNeutralStrandCountPropertyDescriptor( object );
            addNeutralStrandGmrPropertyDescriptor( object );
            addNeutralStrandRadiusPropertyDescriptor( object );
            addNeutralStrandRDC20PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Diameter Over Neutral feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDiameterOverNeutralPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConcentricNeutralCableInfo_diameterOverNeutral_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConcentricNeutralCableInfo_diameterOverNeutral_feature",
                                "_UI_ConcentricNeutralCableInfo_type" ),
                        CimPackage.eINSTANCE.getConcentricNeutralCableInfo_DiameterOverNeutral(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral Strand Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralStrandCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConcentricNeutralCableInfo_neutralStrandCount_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConcentricNeutralCableInfo_neutralStrandCount_feature",
                                "_UI_ConcentricNeutralCableInfo_type" ),
                        CimPackage.eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandCount(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral Strand Gmr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralStrandGmrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConcentricNeutralCableInfo_neutralStrandGmr_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConcentricNeutralCableInfo_neutralStrandGmr_feature",
                                "_UI_ConcentricNeutralCableInfo_type" ),
                        CimPackage.eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandGmr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral Strand Radius feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralStrandRadiusPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConcentricNeutralCableInfo_neutralStrandRadius_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConcentricNeutralCableInfo_neutralStrandRadius_feature",
                                "_UI_ConcentricNeutralCableInfo_type" ),
                        CimPackage.eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandRadius(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Neutral Strand RDC20 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNeutralStrandRDC20PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ConcentricNeutralCableInfo_neutralStrandRDC20_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConcentricNeutralCableInfo_neutralStrandRDC20_feature",
                                "_UI_ConcentricNeutralCableInfo_type" ),
                        CimPackage.eINSTANCE.getConcentricNeutralCableInfo_NeutralStrandRDC20(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns ConcentricNeutralCableInfo.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ConcentricNeutralCableInfo" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ConcentricNeutralCableInfo ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ConcentricNeutralCableInfo_type" )
                : getString( "_UI_ConcentricNeutralCableInfo_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ConcentricNeutralCableInfo.class ) ) {
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__DIAMETER_OVER_NEUTRAL:
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_COUNT:
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_GMR:
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RADIUS:
        case CimPackage.CONCENTRIC_NEUTRAL_CABLE_INFO__NEUTRAL_STRAND_RDC20:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
