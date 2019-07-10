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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArType1IEEEVArController} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PFVArType1IEEEVArControllerItemProvider extends PFVArControllerType1DynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PFVArType1IEEEVArControllerItemProvider( AdapterFactory adapterFactory ) {
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

            addTvarcPropertyDescriptor( object );
            addVvarPropertyDescriptor( object );
            addVvarcbwPropertyDescriptor( object );
            addVvarrefPropertyDescriptor( object );
            addVvtmaxPropertyDescriptor( object );
            addVvtminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Tvarc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTvarcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType1IEEEVArController_tvarc_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_tvarc_feature",
                        "_UI_PFVArType1IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Tvarc(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Vvar feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvarPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PFVArType1IEEEVArController_vvar_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_vvar_feature",
                                "_UI_PFVArType1IEEEVArController_type" ),
                        CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Vvar(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vvarcbw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvarcbwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType1IEEEVArController_vvarcbw_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_vvarcbw_feature",
                        "_UI_PFVArType1IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Vvarcbw(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Vvarref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvarrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType1IEEEVArController_vvarref_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_vvarref_feature",
                        "_UI_PFVArType1IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Vvarref(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Vvtmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvtmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType1IEEEVArController_vvtmax_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_vvtmax_feature",
                        "_UI_PFVArType1IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Vvtmax(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Vvtmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVvtminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PFVArType1IEEEVArController_vvtmin_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PFVArType1IEEEVArController_vvtmin_feature",
                        "_UI_PFVArType1IEEEVArController_type" ),
                CimPackage.eINSTANCE.getPFVArType1IEEEVArController_Vvtmin(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This returns PFVArType1IEEEVArController.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PFVArType1IEEEVArController" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PFVArType1IEEEVArController ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PFVArType1IEEEVArController_type" )
                : getString( "_UI_PFVArType1IEEEVArController_type" ) + " " + label;
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

        switch( notification.getFeatureID( PFVArType1IEEEVArController.class ) ) {
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__TVARC:
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVAR:
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARCBW:
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVARREF:
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMAX:
        case CimPackage.PFV_AR_TYPE1_IEEEV_AR_CONTROLLER__VVTMIN:
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
